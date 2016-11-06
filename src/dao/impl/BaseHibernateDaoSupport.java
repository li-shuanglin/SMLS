package dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.impl.CriteriaImpl.OrderEntry;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BaseDao;
import util.HibernateUtils;
import util.PaginationSupport;

public abstract class BaseHibernateDaoSupport<T> extends HibernateDaoSupport implements BaseDao<T> {
	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public BaseHibernateDaoSupport() {
		entityClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void saveOrUpdate(T instance) {
		getHibernateTemplate().saveOrUpdate(instance);
	}
	
	public void merge(T instance) {
		getHibernateTemplate().merge(instance);
	}

	/* (non-Javadoc)
	 * @see com.pb.blog.dao.BaseDao#delete(java.lang.Object)
	 */
	public void delete(T instance) {
		getHibernateTemplate().delete(instance);
	}

	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		T o = (T) getHibernateTemplate().get(entityClass, id);
		return o;
	}
	public T save(T instance) throws DataAccessException {
		getHibernateTemplate().save(instance);
		return instance;
	}
	public T update(T instance) throws DataAccessException {
		getHibernateTemplate().update(instance);
		return instance;
	}
	public List<T> query(DetachedCriteria criteria,int firstResult,int maxResults) throws DataAccessException {
		return getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}
	
	@SuppressWarnings("unchecked")
	public PaginationSupport<T> findPageByCriteria(
			final DetachedCriteria detachedCriteria, final int pageNo, final int pageSize){
		return (PaginationSupport<T>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Criteria executableCriteria = detachedCriteria.getExecutableCriteria(session);

				// 获取 标准对象中的 排序条目
				OrderEntry[] orderEntries = HibernateUtils.getOrders(executableCriteria);
				// 删除 标准对象中的 排序条目
				executableCriteria = HibernateUtils.removeOrders(executableCriteria);
				// 获取 标准对象中的 投影条件，并存储起来
				Projection projection = HibernateUtils.getProjection(executableCriteria);

				// 查询记录总数，此时，查询记录总数的投影条件替换了旧的投影条件
				int totalCount = ((Integer) executableCriteria.setProjection(Projections.rowCount()).uniqueResult())
						.intValue();

				// 恢复原有的投影条�?
				executableCriteria.setProjection(projection);
				
				if (projection == null) {
					// Set the ResultTransformer to get the same object
					// structure with hql
					executableCriteria.setResultTransformer(CriteriaSpecification.ROOT_ENTITY);
				}
				// 恢复原有的排序条�?
				executableCriteria = HibernateUtils.addOrders(executableCriteria, orderEntries);

				// Now, the Projection and the orderEntries have been resumed
				PaginationSupport pageSupport = new PaginationSupport(pageNo,pageSize);
				int firstResult = pageSupport.getStartRow();
				List<T> items = HibernateUtils.getPageResult(executableCriteria, firstResult, pageSize);
				pageSupport.setItems(items);
				pageSupport.setTotalCount(totalCount);
				return  pageSupport;
			}
		});
	}
	
	public List<T> find(String hql) throws DataAccessException {
		return getHibernateTemplate().find(hql);
	}
	
	public List<T> find(String hql, Object value) throws DataAccessException {
		return getHibernateTemplate().find(hql,value);
	}
	
	public List<T> find(String hql, Object... values) throws DataAccessException {
		return getHibernateTemplate().find(hql,values);
	}
	
	public PaginationSupport<T> findPageByHQL(int pageNo, final int pageSize,
			final String hql, final Object... values) {
		// hql : select count(*) from User u where ... order by...
		String countHql = "select count(*) " + hql.substring(hql.indexOf("from"));
		
		PaginationSupport pageSupport = new PaginationSupport(pageNo,pageSize);
		final int firstResult = pageSupport.getStartRow();
				
		Integer count = (Integer)findFirst(countHql, values);
		
		List<T>	list = getHibernateTemplate().executeFind(new HibernateCallback<List<T>>() {
			public List<T> doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query = session.createQuery(hql);
				for (int i = 0; i < values.length; i++) {
					query.setParameter(i + 1, values[i]);
				}
				query.setFirstResult(firstResult);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
		pageSupport.setItems(list);
		pageSupport.setTotalCount(count);
		
		return pageSupport;
	}
	
	public T findFirst(String hql) throws DataAccessException {
		List<T> list = find(hql);
		if (list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}
	
	public T findFirst(String hql, Object value)
			throws DataAccessException {
		List<T> list = find(hql,value);
		if (list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

	public T findFirst(String hql, Object... values) throws DataAccessException {
		List<T> list = find(hql,values);
		if (list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}
	
}

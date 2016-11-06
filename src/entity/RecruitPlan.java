package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RecruitPlan entity. @author MyEclipse Persistence Tools
 */

public class RecruitPlan implements java.io.Serializable {

	// Fields

	private Long id;
	private DataDictionary dataDictionary;
	private Date times;
	private String title;
	private String createBy;
	private String review;
	private Date createTime;
	private Date lastModifyTime;
	private Boolean flag;
	private String extrainfo;
	private Set recruitDestinations = new HashSet(0);

	// Constructors

	/** default constructor */
	public RecruitPlan() {
	}

	/** full constructor */
	public RecruitPlan(DataDictionary dataDictionary, Date times, String title,
			String createBy, String review, Date createTime,
			Date lastModifyTime, Boolean flag, String extrainfo,
			Set recruitDestinations) {
		this.dataDictionary = dataDictionary;
		this.times = times;
		this.title = title;
		this.createBy = createBy;
		this.review = review;
		this.createTime = createTime;
		this.lastModifyTime = lastModifyTime;
		this.flag = flag;
		this.extrainfo = extrainfo;
		this.recruitDestinations = recruitDestinations;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getExtrainfo() {
		return this.extrainfo;
	}

	public void setExtrainfo(String extrainfo) {
		this.extrainfo = extrainfo;
	}

	public Set getRecruitDestinations() {
		return this.recruitDestinations;
	}

	public void setRecruitDestinations(Set recruitDestinations) {
		this.recruitDestinations = recruitDestinations;
	}

}
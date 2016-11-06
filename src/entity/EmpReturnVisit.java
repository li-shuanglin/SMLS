package entity;

import java.util.Date;

/**
 * EmpReturnVisit entity. @author MyEclipse Persistence Tools
 */

public class EmpReturnVisit implements java.io.Serializable {

	// Fields

	private Long id;
	private DataDictionary dataDictionary;
	private EmployeeInfo employeeInfo;
	private Users users;
	private Date visitTime;
	private String visitContent;

	// Constructors

	/** default constructor */
	public EmpReturnVisit() {
	}

	/** full constructor */
	public EmpReturnVisit(DataDictionary dataDictionary,
			EmployeeInfo employeeInfo, Users users, Date visitTime,
			String visitContent) {
		this.dataDictionary = dataDictionary;
		this.employeeInfo = employeeInfo;
		this.users = users;
		this.visitTime = visitTime;
		this.visitContent = visitContent;
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

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public String getVisitContent() {
		return this.visitContent;
	}

	public void setVisitContent(String visitContent) {
		this.visitContent = visitContent;
	}

}
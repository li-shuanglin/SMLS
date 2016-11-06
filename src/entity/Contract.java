package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Contract entity. @author MyEclipse Persistence Tools
 */

public class Contract implements java.io.Serializable {

	// Fields

	private Integer id;
	private String contractCode;
	private String empName;
	private Date signDate;
	private Date expireDate;
	private Set employeeInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Contract() {
	}

	/** minimal constructor */
	public Contract(String empName) {
		this.empName = empName;
	}

	/** full constructor */
	public Contract(String contractCode, String empName, Date signDate,
			Date expireDate, Set employeeInfos) {
		this.contractCode = contractCode;
		this.empName = empName;
		this.signDate = signDate;
		this.expireDate = expireDate;
		this.employeeInfos = employeeInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContractCode() {
		return this.contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

}
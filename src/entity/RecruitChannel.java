package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * RecruitChannel entity. @author MyEclipse Persistence Tools
 */

public class RecruitChannel implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Boolean flag;
	private Set employeeInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public RecruitChannel() {
	}

	/** full constructor */
	public RecruitChannel(String name, Boolean flag, Set employeeInfos) {
		this.name = name;
		this.flag = flag;
		this.employeeInfos = employeeInfos;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

}
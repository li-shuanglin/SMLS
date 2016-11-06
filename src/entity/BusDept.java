package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * BusDept entity. @author MyEclipse Persistence Tools
 */

public class BusDept implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Set calledsForOldDeptId = new HashSet(0);
	private Set constructors = new HashSet(0);
	private Set calledsForNewDeptId = new HashSet(0);
	private Set salaries = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set employeeInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public BusDept() {
	}

	/** full constructor */
	public BusDept(String name, Set calledsForOldDeptId, Set constructors,
			Set calledsForNewDeptId, Set salaries, Set promotions,
			Set employeeInfos) {
		this.name = name;
		this.calledsForOldDeptId = calledsForOldDeptId;
		this.constructors = constructors;
		this.calledsForNewDeptId = calledsForNewDeptId;
		this.salaries = salaries;
		this.promotions = promotions;
		this.employeeInfos = employeeInfos;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCalledsForOldDeptId() {
		return this.calledsForOldDeptId;
	}

	public void setCalledsForOldDeptId(Set calledsForOldDeptId) {
		this.calledsForOldDeptId = calledsForOldDeptId;
	}

	public Set getConstructors() {
		return this.constructors;
	}

	public void setConstructors(Set constructors) {
		this.constructors = constructors;
	}

	public Set getCalledsForNewDeptId() {
		return this.calledsForNewDeptId;
	}

	public void setCalledsForNewDeptId(Set calledsForNewDeptId) {
		this.calledsForNewDeptId = calledsForNewDeptId;
	}

	public Set getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

	public Set getPromotions() {
		return this.promotions;
	}

	public void setPromotions(Set promotions) {
		this.promotions = promotions;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

}
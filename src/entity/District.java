package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * District entity. @author MyEclipse Persistence Tools
 */

public class District implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Set calledsForOldDistrictId = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set salaries = new HashSet(0);
	private Set employeeInfos = new HashSet(0);
	private Set constructors = new HashSet(0);
	private Set calledsForNewDistrictId = new HashSet(0);

	// Constructors

	/** default constructor */
	public District() {
	}

	/** full constructor */
	public District(String name, Set calledsForOldDistrictId, Set promotions,
			Set salaries, Set employeeInfos, Set constructors,
			Set calledsForNewDistrictId) {
		this.name = name;
		this.calledsForOldDistrictId = calledsForOldDistrictId;
		this.promotions = promotions;
		this.salaries = salaries;
		this.employeeInfos = employeeInfos;
		this.constructors = constructors;
		this.calledsForNewDistrictId = calledsForNewDistrictId;
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

	public Set getCalledsForOldDistrictId() {
		return this.calledsForOldDistrictId;
	}

	public void setCalledsForOldDistrictId(Set calledsForOldDistrictId) {
		this.calledsForOldDistrictId = calledsForOldDistrictId;
	}

	public Set getPromotions() {
		return this.promotions;
	}

	public void setPromotions(Set promotions) {
		this.promotions = promotions;
	}

	public Set getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

	public Set getConstructors() {
		return this.constructors;
	}

	public void setConstructors(Set constructors) {
		this.constructors = constructors;
	}

	public Set getCalledsForNewDistrictId() {
		return this.calledsForNewDistrictId;
	}

	public void setCalledsForNewDistrictId(Set calledsForNewDistrictId) {
		this.calledsForNewDistrictId = calledsForNewDistrictId;
	}

}
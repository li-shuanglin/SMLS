package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Area entity. @author MyEclipse Persistence Tools
 */

public class Area implements java.io.Serializable {

	// Fields

	private Short id;
	private Constructor constructor;
	private String name;
	private Set calledsForNewAreaId = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set calledsForOldAreaId = new HashSet(0);
	private Set employeeInfos = new HashSet(0);
	private Set salaries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Area() {
	}

	/** full constructor */
	public Area(Constructor constructor, String name, Set calledsForNewAreaId,
			Set promotions, Set calledsForOldAreaId, Set employeeInfos,
			Set salaries) {
		this.constructor = constructor;
		this.name = name;
		this.calledsForNewAreaId = calledsForNewAreaId;
		this.promotions = promotions;
		this.calledsForOldAreaId = calledsForOldAreaId;
		this.employeeInfos = employeeInfos;
		this.salaries = salaries;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Constructor getConstructor() {
		return this.constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCalledsForNewAreaId() {
		return this.calledsForNewAreaId;
	}

	public void setCalledsForNewAreaId(Set calledsForNewAreaId) {
		this.calledsForNewAreaId = calledsForNewAreaId;
	}

	public Set getPromotions() {
		return this.promotions;
	}

	public void setPromotions(Set promotions) {
		this.promotions = promotions;
	}

	public Set getCalledsForOldAreaId() {
		return this.calledsForOldAreaId;
	}

	public void setCalledsForOldAreaId(Set calledsForOldAreaId) {
		this.calledsForOldAreaId = calledsForOldAreaId;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

	public Set getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

}
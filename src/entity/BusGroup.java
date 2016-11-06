package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * BusGroup entity. @author MyEclipse Persistence Tools
 */

public class BusGroup implements java.io.Serializable {

	// Fields

	private Byte id;
	private String name;
	private Set employeeInfos = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set salaries = new HashSet(0);
	private Set constructors = new HashSet(0);
	private Set calledsForOldGroupId = new HashSet(0);
	private Set calledsForNewGroupId = new HashSet(0);

	// Constructors

	/** default constructor */
	public BusGroup() {
	}

	/** full constructor */
	public BusGroup(String name, Set employeeInfos, Set promotions,
			Set salaries, Set constructors, Set calledsForOldGroupId,
			Set calledsForNewGroupId) {
		this.name = name;
		this.employeeInfos = employeeInfos;
		this.promotions = promotions;
		this.salaries = salaries;
		this.constructors = constructors;
		this.calledsForOldGroupId = calledsForOldGroupId;
		this.calledsForNewGroupId = calledsForNewGroupId;
	}

	// Property accessors

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
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

	public Set getConstructors() {
		return this.constructors;
	}

	public void setConstructors(Set constructors) {
		this.constructors = constructors;
	}

	public Set getCalledsForOldGroupId() {
		return this.calledsForOldGroupId;
	}

	public void setCalledsForOldGroupId(Set calledsForOldGroupId) {
		this.calledsForOldGroupId = calledsForOldGroupId;
	}

	public Set getCalledsForNewGroupId() {
		return this.calledsForNewGroupId;
	}

	public void setCalledsForNewGroupId(Set calledsForNewGroupId) {
		this.calledsForNewGroupId = calledsForNewGroupId;
	}

}
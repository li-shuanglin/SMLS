package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Position entity. @author MyEclipse Persistence Tools
 */

public class Position implements java.io.Serializable {

	// Fields

	private Short id;
	private Dept dept;
	private String name;
	private Set employeeInfos = new HashSet(0);
	private Set calledsForNewPositionId = new HashSet(0);
	private Set promotionsForProPosition = new HashSet(0);
	private Set calledsForOldPositionId = new HashSet(0);
	private Set recruitDestinations = new HashSet(0);
	private Set briefs = new HashSet(0);
	private Set promotionsForCurPosition = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** full constructor */
	public Position(Dept dept, String name, Set employeeInfos,
			Set calledsForNewPositionId, Set promotionsForProPosition,
			Set calledsForOldPositionId, Set recruitDestinations, Set briefs,
			Set promotionsForCurPosition) {
		this.dept = dept;
		this.name = name;
		this.employeeInfos = employeeInfos;
		this.calledsForNewPositionId = calledsForNewPositionId;
		this.promotionsForProPosition = promotionsForProPosition;
		this.calledsForOldPositionId = calledsForOldPositionId;
		this.recruitDestinations = recruitDestinations;
		this.briefs = briefs;
		this.promotionsForCurPosition = promotionsForCurPosition;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
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

	public Set getCalledsForNewPositionId() {
		return this.calledsForNewPositionId;
	}

	public void setCalledsForNewPositionId(Set calledsForNewPositionId) {
		this.calledsForNewPositionId = calledsForNewPositionId;
	}

	public Set getPromotionsForProPosition() {
		return this.promotionsForProPosition;
	}

	public void setPromotionsForProPosition(Set promotionsForProPosition) {
		this.promotionsForProPosition = promotionsForProPosition;
	}

	public Set getCalledsForOldPositionId() {
		return this.calledsForOldPositionId;
	}

	public void setCalledsForOldPositionId(Set calledsForOldPositionId) {
		this.calledsForOldPositionId = calledsForOldPositionId;
	}

	public Set getRecruitDestinations() {
		return this.recruitDestinations;
	}

	public void setRecruitDestinations(Set recruitDestinations) {
		this.recruitDestinations = recruitDestinations;
	}

	public Set getBriefs() {
		return this.briefs;
	}

	public void setBriefs(Set briefs) {
		this.briefs = briefs;
	}

	public Set getPromotionsForCurPosition() {
		return this.promotionsForCurPosition;
	}

	public void setPromotionsForCurPosition(Set promotionsForCurPosition) {
		this.promotionsForCurPosition = promotionsForCurPosition;
	}

}
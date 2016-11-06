package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * DataDictionary entity. @author MyEclipse Persistence Tools
 */

public class DataDictionary implements java.io.Serializable {

	// Fields

	private String name;
	private String value;
	private Byte type;
	private Set trainsForTrainState = new HashSet(0);
	private Set empReturnVisits = new HashSet(0);
	private Set salaries = new HashSet(0);
	private Set wages = new HashSet(0);
	private Set notices = new HashSet(0);
	private Set briefs = new HashSet(0);
	private Set recruitPlans = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set employeeInfos = new HashSet(0);
	private Set trainsForTrainType = new HashSet(0);

	// Constructors

	/** default constructor */
	public DataDictionary() {
	}

	/** full constructor */
	public DataDictionary(String value, Byte type, Set trainsForTrainState,
			Set empReturnVisits, Set salaries, Set wages, Set notices,
			Set briefs, Set recruitPlans, Set promotions, Set employeeInfos,
			Set trainsForTrainType) {
		this.value = value;
		this.type = type;
		this.trainsForTrainState = trainsForTrainState;
		this.empReturnVisits = empReturnVisits;
		this.salaries = salaries;
		this.wages = wages;
		this.notices = notices;
		this.briefs = briefs;
		this.recruitPlans = recruitPlans;
		this.promotions = promotions;
		this.employeeInfos = employeeInfos;
		this.trainsForTrainType = trainsForTrainType;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Byte getType() {
		return this.type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Set getTrainsForTrainState() {
		return this.trainsForTrainState;
	}

	public void setTrainsForTrainState(Set trainsForTrainState) {
		this.trainsForTrainState = trainsForTrainState;
	}

	public Set getEmpReturnVisits() {
		return this.empReturnVisits;
	}

	public void setEmpReturnVisits(Set empReturnVisits) {
		this.empReturnVisits = empReturnVisits;
	}

	public Set getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

	public Set getWages() {
		return this.wages;
	}

	public void setWages(Set wages) {
		this.wages = wages;
	}

	public Set getNotices() {
		return this.notices;
	}

	public void setNotices(Set notices) {
		this.notices = notices;
	}

	public Set getBriefs() {
		return this.briefs;
	}

	public void setBriefs(Set briefs) {
		this.briefs = briefs;
	}

	public Set getRecruitPlans() {
		return this.recruitPlans;
	}

	public void setRecruitPlans(Set recruitPlans) {
		this.recruitPlans = recruitPlans;
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

	public Set getTrainsForTrainType() {
		return this.trainsForTrainType;
	}

	public void setTrainsForTrainType(Set trainsForTrainType) {
		this.trainsForTrainType = trainsForTrainType;
	}

}
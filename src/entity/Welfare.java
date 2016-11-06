package entity;

/**
 * Welfare entity. @author MyEclipse Persistence Tools
 */

public class Welfare implements java.io.Serializable {

	// Fields

	private Long id;
	private EmployeeInfo employeeInfo;
	private Boolean endInsurance;
	private Boolean unemployInsurance;
	private Boolean medicalInsurance;
	private Boolean injuryInsurance;
	private Boolean givenbirthInsurance;
	private Boolean founds;
	private Double selfFoden;
	private Double eeFoden;

	// Constructors

	/** default constructor */
	public Welfare() {
	}

	/** full constructor */
	public Welfare(EmployeeInfo employeeInfo, Boolean endInsurance,
			Boolean unemployInsurance, Boolean medicalInsurance,
			Boolean injuryInsurance, Boolean givenbirthInsurance,
			Boolean founds, Double selfFoden, Double eeFoden) {
		this.employeeInfo = employeeInfo;
		this.endInsurance = endInsurance;
		this.unemployInsurance = unemployInsurance;
		this.medicalInsurance = medicalInsurance;
		this.injuryInsurance = injuryInsurance;
		this.givenbirthInsurance = givenbirthInsurance;
		this.founds = founds;
		this.selfFoden = selfFoden;
		this.eeFoden = eeFoden;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public Boolean getEndInsurance() {
		return this.endInsurance;
	}

	public void setEndInsurance(Boolean endInsurance) {
		this.endInsurance = endInsurance;
	}

	public Boolean getUnemployInsurance() {
		return this.unemployInsurance;
	}

	public void setUnemployInsurance(Boolean unemployInsurance) {
		this.unemployInsurance = unemployInsurance;
	}

	public Boolean getMedicalInsurance() {
		return this.medicalInsurance;
	}

	public void setMedicalInsurance(Boolean medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public Boolean getInjuryInsurance() {
		return this.injuryInsurance;
	}

	public void setInjuryInsurance(Boolean injuryInsurance) {
		this.injuryInsurance = injuryInsurance;
	}

	public Boolean getGivenbirthInsurance() {
		return this.givenbirthInsurance;
	}

	public void setGivenbirthInsurance(Boolean givenbirthInsurance) {
		this.givenbirthInsurance = givenbirthInsurance;
	}

	public Boolean getFounds() {
		return this.founds;
	}

	public void setFounds(Boolean founds) {
		this.founds = founds;
	}

	public Double getSelfFoden() {
		return this.selfFoden;
	}

	public void setSelfFoden(Double selfFoden) {
		this.selfFoden = selfFoden;
	}

	public Double getEeFoden() {
		return this.eeFoden;
	}

	public void setEeFoden(Double eeFoden) {
		this.eeFoden = eeFoden;
	}

}
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Constructor entity. @author MyEclipse Persistence Tools
 */

public class Constructor implements java.io.Serializable {

	// Fields

	private Short id;
	private BusDept busDept;
	private BusGroup busGroup;
	private District district;
	private Double basicInsurance;
	private Double endInsuranceCompany;
	private Double endInsuranceSelf;
	private Double unemployeeInsuranceCompany;
	private Double unemployeeInsuranceSelf;
	private Double medicalInsuranceCompany;
	private Double medicalInsuranceSelf;
	private Double injuryInsuranceCompany;
	private Double injuryInsuranceSelf;
	private Double givenbirthInsuranceCompany;
	private Double givenbirthInsuranceSelf;
	private Double foundsCompany;
	private Double foundsSelf;
	private Short beds;
	private Short lanches;
	private Short instrument;
	private Set areas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Constructor() {
	}

	/** full constructor */
	public Constructor(BusDept busDept, BusGroup busGroup, District district,
			Double basicInsurance, Double endInsuranceCompany,
			Double endInsuranceSelf, Double unemployeeInsuranceCompany,
			Double unemployeeInsuranceSelf, Double medicalInsuranceCompany,
			Double medicalInsuranceSelf, Double injuryInsuranceCompany,
			Double injuryInsuranceSelf, Double givenbirthInsuranceCompany,
			Double givenbirthInsuranceSelf, Double foundsCompany,
			Double foundsSelf, Short beds, Short lanches, Short instrument,
			Set areas) {
		this.busDept = busDept;
		this.busGroup = busGroup;
		this.district = district;
		this.basicInsurance = basicInsurance;
		this.endInsuranceCompany = endInsuranceCompany;
		this.endInsuranceSelf = endInsuranceSelf;
		this.unemployeeInsuranceCompany = unemployeeInsuranceCompany;
		this.unemployeeInsuranceSelf = unemployeeInsuranceSelf;
		this.medicalInsuranceCompany = medicalInsuranceCompany;
		this.medicalInsuranceSelf = medicalInsuranceSelf;
		this.injuryInsuranceCompany = injuryInsuranceCompany;
		this.injuryInsuranceSelf = injuryInsuranceSelf;
		this.givenbirthInsuranceCompany = givenbirthInsuranceCompany;
		this.givenbirthInsuranceSelf = givenbirthInsuranceSelf;
		this.foundsCompany = foundsCompany;
		this.foundsSelf = foundsSelf;
		this.beds = beds;
		this.lanches = lanches;
		this.instrument = instrument;
		this.areas = areas;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public BusDept getBusDept() {
		return this.busDept;
	}

	public void setBusDept(BusDept busDept) {
		this.busDept = busDept;
	}

	public BusGroup getBusGroup() {
		return this.busGroup;
	}

	public void setBusGroup(BusGroup busGroup) {
		this.busGroup = busGroup;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Double getBasicInsurance() {
		return this.basicInsurance;
	}

	public void setBasicInsurance(Double basicInsurance) {
		this.basicInsurance = basicInsurance;
	}

	public Double getEndInsuranceCompany() {
		return this.endInsuranceCompany;
	}

	public void setEndInsuranceCompany(Double endInsuranceCompany) {
		this.endInsuranceCompany = endInsuranceCompany;
	}

	public Double getEndInsuranceSelf() {
		return this.endInsuranceSelf;
	}

	public void setEndInsuranceSelf(Double endInsuranceSelf) {
		this.endInsuranceSelf = endInsuranceSelf;
	}

	public Double getUnemployeeInsuranceCompany() {
		return this.unemployeeInsuranceCompany;
	}

	public void setUnemployeeInsuranceCompany(Double unemployeeInsuranceCompany) {
		this.unemployeeInsuranceCompany = unemployeeInsuranceCompany;
	}

	public Double getUnemployeeInsuranceSelf() {
		return this.unemployeeInsuranceSelf;
	}

	public void setUnemployeeInsuranceSelf(Double unemployeeInsuranceSelf) {
		this.unemployeeInsuranceSelf = unemployeeInsuranceSelf;
	}

	public Double getMedicalInsuranceCompany() {
		return this.medicalInsuranceCompany;
	}

	public void setMedicalInsuranceCompany(Double medicalInsuranceCompany) {
		this.medicalInsuranceCompany = medicalInsuranceCompany;
	}

	public Double getMedicalInsuranceSelf() {
		return this.medicalInsuranceSelf;
	}

	public void setMedicalInsuranceSelf(Double medicalInsuranceSelf) {
		this.medicalInsuranceSelf = medicalInsuranceSelf;
	}

	public Double getInjuryInsuranceCompany() {
		return this.injuryInsuranceCompany;
	}

	public void setInjuryInsuranceCompany(Double injuryInsuranceCompany) {
		this.injuryInsuranceCompany = injuryInsuranceCompany;
	}

	public Double getInjuryInsuranceSelf() {
		return this.injuryInsuranceSelf;
	}

	public void setInjuryInsuranceSelf(Double injuryInsuranceSelf) {
		this.injuryInsuranceSelf = injuryInsuranceSelf;
	}

	public Double getGivenbirthInsuranceCompany() {
		return this.givenbirthInsuranceCompany;
	}

	public void setGivenbirthInsuranceCompany(Double givenbirthInsuranceCompany) {
		this.givenbirthInsuranceCompany = givenbirthInsuranceCompany;
	}

	public Double getGivenbirthInsuranceSelf() {
		return this.givenbirthInsuranceSelf;
	}

	public void setGivenbirthInsuranceSelf(Double givenbirthInsuranceSelf) {
		this.givenbirthInsuranceSelf = givenbirthInsuranceSelf;
	}

	public Double getFoundsCompany() {
		return this.foundsCompany;
	}

	public void setFoundsCompany(Double foundsCompany) {
		this.foundsCompany = foundsCompany;
	}

	public Double getFoundsSelf() {
		return this.foundsSelf;
	}

	public void setFoundsSelf(Double foundsSelf) {
		this.foundsSelf = foundsSelf;
	}

	public Short getBeds() {
		return this.beds;
	}

	public void setBeds(Short beds) {
		this.beds = beds;
	}

	public Short getLanches() {
		return this.lanches;
	}

	public void setLanches(Short lanches) {
		this.lanches = lanches;
	}

	public Short getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Short instrument) {
		this.instrument = instrument;
	}

	public Set getAreas() {
		return this.areas;
	}

	public void setAreas(Set areas) {
		this.areas = areas;
	}

}
package entity;

/**
 * Wage entity. @author MyEclipse Persistence Tools
 */

public class Wage implements java.io.Serializable {

	// Fields

	private Long id;
	private DataDictionary dataDictionary;
	private EmployeeInfo employeeInfo;
	private Byte attendance;
	private Double comm;
	private String commExplain;
	private Double insurance;
	private Double founds;
	private Double achievment;
	private Byte months;
	private String createby;
	private String review;

	// Constructors

	/** default constructor */
	public Wage() {
	}

	/** full constructor */
	public Wage(DataDictionary dataDictionary, EmployeeInfo employeeInfo,
			Byte attendance, Double comm, String commExplain, Double insurance,
			Double founds, Double achievment, Byte months, String createby,
			String review) {
		this.dataDictionary = dataDictionary;
		this.employeeInfo = employeeInfo;
		this.attendance = attendance;
		this.comm = comm;
		this.commExplain = commExplain;
		this.insurance = insurance;
		this.founds = founds;
		this.achievment = achievment;
		this.months = months;
		this.createby = createby;
		this.review = review;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public Byte getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Byte attendance) {
		this.attendance = attendance;
	}

	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public String getCommExplain() {
		return this.commExplain;
	}

	public void setCommExplain(String commExplain) {
		this.commExplain = commExplain;
	}

	public Double getInsurance() {
		return this.insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getFounds() {
		return this.founds;
	}

	public void setFounds(Double founds) {
		this.founds = founds;
	}

	public Double getAchievment() {
		return this.achievment;
	}

	public void setAchievment(Double achievment) {
		this.achievment = achievment;
	}

	public Byte getMonths() {
		return this.months;
	}

	public void setMonths(Byte months) {
		this.months = months;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
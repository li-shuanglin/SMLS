package entity;

/**
 * Brief entity. @author MyEclipse Persistence Tools
 */

public class Brief implements java.io.Serializable {

	// Fields

	private Long id;
	private Position position;
	private DataDictionary dataDictionary;
	private Dept dept;
	private Train train;
	private String name;
	private Byte age;
	private String tellPhone;
	private String address;
	private String idCard;
	private String selfIdentify;
	private String hobby;
	private String review;
	private String reviewby;
	private Boolean cultureResult;
	private Boolean skillResult;
	private String workExperience;

	// Constructors

	/** default constructor */
	public Brief() {
	}

	/** full constructor */
	public Brief(Position position, DataDictionary dataDictionary, Dept dept,
			Train train, String name, Byte age, String tellPhone,
			String address, String idCard, String selfIdentify, String hobby,
			String review, String reviewby, Boolean cultureResult,
			Boolean skillResult, String workExperience) {
		this.position = position;
		this.dataDictionary = dataDictionary;
		this.dept = dept;
		this.train = train;
		this.name = name;
		this.age = age;
		this.tellPhone = tellPhone;
		this.address = address;
		this.idCard = idCard;
		this.selfIdentify = selfIdentify;
		this.hobby = hobby;
		this.review = review;
		this.reviewby = reviewby;
		this.cultureResult = cultureResult;
		this.skillResult = skillResult;
		this.workExperience = workExperience;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Train getTrain() {
		return this.train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getAge() {
		return this.age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public String getTellPhone() {
		return this.tellPhone;
	}

	public void setTellPhone(String tellPhone) {
		this.tellPhone = tellPhone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSelfIdentify() {
		return this.selfIdentify;
	}

	public void setSelfIdentify(String selfIdentify) {
		this.selfIdentify = selfIdentify;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReviewby() {
		return this.reviewby;
	}

	public void setReviewby(String reviewby) {
		this.reviewby = reviewby;
	}

	public Boolean getCultureResult() {
		return this.cultureResult;
	}

	public void setCultureResult(Boolean cultureResult) {
		this.cultureResult = cultureResult;
	}

	public Boolean getSkillResult() {
		return this.skillResult;
	}

	public void setSkillResult(Boolean skillResult) {
		this.skillResult = skillResult;
	}

	public String getWorkExperience() {
		return this.workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

}
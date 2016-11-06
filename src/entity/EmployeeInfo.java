package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EmployeeInfo entity. @author MyEclipse Persistence Tools
 */

public class EmployeeInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private BusDept busDept;
	private Area area;
	private District district;
	private LevelRank levelRank;
	private DataDictionary dataDictionary;
	private BusGroup busGroup;
	private Contract contract;
	private RecruitChannel recruitChannel;
	private Position position;
	private String code;
	private String name;
	private Byte age;
	private Boolean sex;
	private String address;
	private String tellPhone;
	private String homePhone;
	private String emergencyContact;
	private String energereyContactRelation;
	private String idcard;
	private String education;
	private Date hiredate;
	private Date bomdate;
	private Set wages = new HashSet(0);
	private Set promotions = new HashSet(0);
	private Set welfares = new HashSet(0);
	private Set empReturnVisits = new HashSet(0);

	// Constructors

	/** default constructor */
	public EmployeeInfo() {
	}

	/** minimal constructor */
	public EmployeeInfo(String code, String name, String idcard) {
		this.code = code;
		this.name = name;
		this.idcard = idcard;
	}

	/** full constructor */
	public EmployeeInfo(BusDept busDept, Area area, District district,
			LevelRank levelRank, DataDictionary dataDictionary,
			BusGroup busGroup, Contract contract,
			RecruitChannel recruitChannel, Position position, String code,
			String name, Byte age, Boolean sex, String address,
			String tellPhone, String homePhone, String emergencyContact,
			String energereyContactRelation, String idcard, String education,
			Date hiredate, Date bomdate, Set wages, Set promotions,
			Set welfares, Set empReturnVisits) {
		this.busDept = busDept;
		this.area = area;
		this.district = district;
		this.levelRank = levelRank;
		this.dataDictionary = dataDictionary;
		this.busGroup = busGroup;
		this.contract = contract;
		this.recruitChannel = recruitChannel;
		this.position = position;
		this.code = code;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.tellPhone = tellPhone;
		this.homePhone = homePhone;
		this.emergencyContact = emergencyContact;
		this.energereyContactRelation = energereyContactRelation;
		this.idcard = idcard;
		this.education = education;
		this.hiredate = hiredate;
		this.bomdate = bomdate;
		this.wages = wages;
		this.promotions = promotions;
		this.welfares = welfares;
		this.empReturnVisits = empReturnVisits;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BusDept getBusDept() {
		return this.busDept;
	}

	public void setBusDept(BusDept busDept) {
		this.busDept = busDept;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public LevelRank getLevelRank() {
		return this.levelRank;
	}

	public void setLevelRank(LevelRank levelRank) {
		this.levelRank = levelRank;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public BusGroup getBusGroup() {
		return this.busGroup;
	}

	public void setBusGroup(BusGroup busGroup) {
		this.busGroup = busGroup;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public RecruitChannel getRecruitChannel() {
		return this.recruitChannel;
	}

	public void setRecruitChannel(RecruitChannel recruitChannel) {
		this.recruitChannel = recruitChannel;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTellPhone() {
		return this.tellPhone;
	}

	public void setTellPhone(String tellPhone) {
		this.tellPhone = tellPhone;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEnergereyContactRelation() {
		return this.energereyContactRelation;
	}

	public void setEnergereyContactRelation(String energereyContactRelation) {
		this.energereyContactRelation = energereyContactRelation;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getBomdate() {
		return this.bomdate;
	}

	public void setBomdate(Date bomdate) {
		this.bomdate = bomdate;
	}

	public Set getWages() {
		return this.wages;
	}

	public void setWages(Set wages) {
		this.wages = wages;
	}

	public Set getPromotions() {
		return this.promotions;
	}

	public void setPromotions(Set promotions) {
		this.promotions = promotions;
	}

	public Set getWelfares() {
		return this.welfares;
	}

	public void setWelfares(Set welfares) {
		this.welfares = welfares;
	}

	public Set getEmpReturnVisits() {
		return this.empReturnVisits;
	}

	public void setEmpReturnVisits(Set empReturnVisits) {
		this.empReturnVisits = empReturnVisits;
	}

}
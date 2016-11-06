package entity;

/**
 * Promotion entity. @author MyEclipse Persistence Tools
 */

public class Promotion implements java.io.Serializable {

	// Fields

	private Long id;
	private BusDept busDept;
	private DataDictionary dataDictionary;
	private District district;
	private Area area;
	private EmployeeInfo employeeInfo;
	private Position positionByProPosition;
	private BusGroup busGroup;
	private Position positionByCurPosition;
	private String createby;
	private String desire;
	private Boolean hrResult;
	private String hrAdvice;
	private Boolean skillResult;
	private String skillAdvice;
	private Boolean result;

	// Constructors

	/** default constructor */
	public Promotion() {
	}

	/** full constructor */
	public Promotion(BusDept busDept, DataDictionary dataDictionary,
			District district, Area area, EmployeeInfo employeeInfo,
			Position positionByProPosition, BusGroup busGroup,
			Position positionByCurPosition, String createby, String desire,
			Boolean hrResult, String hrAdvice, Boolean skillResult,
			String skillAdvice, Boolean result) {
		this.busDept = busDept;
		this.dataDictionary = dataDictionary;
		this.district = district;
		this.area = area;
		this.employeeInfo = employeeInfo;
		this.positionByProPosition = positionByProPosition;
		this.busGroup = busGroup;
		this.positionByCurPosition = positionByCurPosition;
		this.createby = createby;
		this.desire = desire;
		this.hrResult = hrResult;
		this.hrAdvice = hrAdvice;
		this.skillResult = skillResult;
		this.skillAdvice = skillAdvice;
		this.result = result;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BusDept getBusDept() {
		return this.busDept;
	}

	public void setBusDept(BusDept busDept) {
		this.busDept = busDept;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public Position getPositionByProPosition() {
		return this.positionByProPosition;
	}

	public void setPositionByProPosition(Position positionByProPosition) {
		this.positionByProPosition = positionByProPosition;
	}

	public BusGroup getBusGroup() {
		return this.busGroup;
	}

	public void setBusGroup(BusGroup busGroup) {
		this.busGroup = busGroup;
	}

	public Position getPositionByCurPosition() {
		return this.positionByCurPosition;
	}

	public void setPositionByCurPosition(Position positionByCurPosition) {
		this.positionByCurPosition = positionByCurPosition;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getDesire() {
		return this.desire;
	}

	public void setDesire(String desire) {
		this.desire = desire;
	}

	public Boolean getHrResult() {
		return this.hrResult;
	}

	public void setHrResult(Boolean hrResult) {
		this.hrResult = hrResult;
	}

	public String getHrAdvice() {
		return this.hrAdvice;
	}

	public void setHrAdvice(String hrAdvice) {
		this.hrAdvice = hrAdvice;
	}

	public Boolean getSkillResult() {
		return this.skillResult;
	}

	public void setSkillResult(Boolean skillResult) {
		this.skillResult = skillResult;
	}

	public String getSkillAdvice() {
		return this.skillAdvice;
	}

	public void setSkillAdvice(String skillAdvice) {
		this.skillAdvice = skillAdvice;
	}

	public Boolean getResult() {
		return this.result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

}
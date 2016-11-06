package entity;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */

public class Salary implements java.io.Serializable {

	// Fields

	private Byte id;
	private Area area;
	private BusGroup busGroup;
	private LevelRank levelRank;
	private DataDictionary dataDictionary;
	private BusDept busDept;
	private District district;
	private Short baseSalary;

	// Constructors

	/** default constructor */
	public Salary() {
	}

	/** full constructor */
	public Salary(Area area, BusGroup busGroup, LevelRank levelRank,
			DataDictionary dataDictionary, BusDept busDept, District district,
			Short baseSalary) {
		this.area = area;
		this.busGroup = busGroup;
		this.levelRank = levelRank;
		this.dataDictionary = dataDictionary;
		this.busDept = busDept;
		this.district = district;
		this.baseSalary = baseSalary;
	}

	// Property accessors

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public BusGroup getBusGroup() {
		return this.busGroup;
	}

	public void setBusGroup(BusGroup busGroup) {
		this.busGroup = busGroup;
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

	public BusDept getBusDept() {
		return this.busDept;
	}

	public void setBusDept(BusDept busDept) {
		this.busDept = busDept;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Short getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(Short baseSalary) {
		this.baseSalary = baseSalary;
	}

}
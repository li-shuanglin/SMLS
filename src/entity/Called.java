package entity;

/**
 * Called entity. @author MyEclipse Persistence Tools
 */

public class Called implements java.io.Serializable {

	// Fields

	private CalledId id;
	private BusDept busDeptByNewDeptId;
	private BusDept busDeptByOldDeptId;
	private Position positionByNewPositionId;
	private Position positionByOldPositionId;
	private Area areaByOldAreaId;
	private District districtByOldDistrictId;
	private BusGroup busGroupByOldGroupId;
	private Area areaByNewAreaId;
	private BusGroup busGroupByNewGroupId;
	private District districtByNewDistrictId;

	// Constructors

	/** default constructor */
	public Called() {
	}

	/** minimal constructor */
	public Called(CalledId id) {
		this.id = id;
	}

	/** full constructor */
	public Called(CalledId id, BusDept busDeptByNewDeptId,
			BusDept busDeptByOldDeptId, Position positionByNewPositionId,
			Position positionByOldPositionId, Area areaByOldAreaId,
			District districtByOldDistrictId, BusGroup busGroupByOldGroupId,
			Area areaByNewAreaId, BusGroup busGroupByNewGroupId,
			District districtByNewDistrictId) {
		this.id = id;
		this.busDeptByNewDeptId = busDeptByNewDeptId;
		this.busDeptByOldDeptId = busDeptByOldDeptId;
		this.positionByNewPositionId = positionByNewPositionId;
		this.positionByOldPositionId = positionByOldPositionId;
		this.areaByOldAreaId = areaByOldAreaId;
		this.districtByOldDistrictId = districtByOldDistrictId;
		this.busGroupByOldGroupId = busGroupByOldGroupId;
		this.areaByNewAreaId = areaByNewAreaId;
		this.busGroupByNewGroupId = busGroupByNewGroupId;
		this.districtByNewDistrictId = districtByNewDistrictId;
	}

	// Property accessors

	public CalledId getId() {
		return this.id;
	}

	public void setId(CalledId id) {
		this.id = id;
	}

	public BusDept getBusDeptByNewDeptId() {
		return this.busDeptByNewDeptId;
	}

	public void setBusDeptByNewDeptId(BusDept busDeptByNewDeptId) {
		this.busDeptByNewDeptId = busDeptByNewDeptId;
	}

	public BusDept getBusDeptByOldDeptId() {
		return this.busDeptByOldDeptId;
	}

	public void setBusDeptByOldDeptId(BusDept busDeptByOldDeptId) {
		this.busDeptByOldDeptId = busDeptByOldDeptId;
	}

	public Position getPositionByNewPositionId() {
		return this.positionByNewPositionId;
	}

	public void setPositionByNewPositionId(Position positionByNewPositionId) {
		this.positionByNewPositionId = positionByNewPositionId;
	}

	public Position getPositionByOldPositionId() {
		return this.positionByOldPositionId;
	}

	public void setPositionByOldPositionId(Position positionByOldPositionId) {
		this.positionByOldPositionId = positionByOldPositionId;
	}

	public Area getAreaByOldAreaId() {
		return this.areaByOldAreaId;
	}

	public void setAreaByOldAreaId(Area areaByOldAreaId) {
		this.areaByOldAreaId = areaByOldAreaId;
	}

	public District getDistrictByOldDistrictId() {
		return this.districtByOldDistrictId;
	}

	public void setDistrictByOldDistrictId(District districtByOldDistrictId) {
		this.districtByOldDistrictId = districtByOldDistrictId;
	}

	public BusGroup getBusGroupByOldGroupId() {
		return this.busGroupByOldGroupId;
	}

	public void setBusGroupByOldGroupId(BusGroup busGroupByOldGroupId) {
		this.busGroupByOldGroupId = busGroupByOldGroupId;
	}

	public Area getAreaByNewAreaId() {
		return this.areaByNewAreaId;
	}

	public void setAreaByNewAreaId(Area areaByNewAreaId) {
		this.areaByNewAreaId = areaByNewAreaId;
	}

	public BusGroup getBusGroupByNewGroupId() {
		return this.busGroupByNewGroupId;
	}

	public void setBusGroupByNewGroupId(BusGroup busGroupByNewGroupId) {
		this.busGroupByNewGroupId = busGroupByNewGroupId;
	}

	public District getDistrictByNewDistrictId() {
		return this.districtByNewDistrictId;
	}

	public void setDistrictByNewDistrictId(District districtByNewDistrictId) {
		this.districtByNewDistrictId = districtByNewDistrictId;
	}

}
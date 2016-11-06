package entity;

import java.util.Date;

/**
 * CalledId entity. @author MyEclipse Persistence Tools
 */

public class CalledId implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer empno;
	private BusGroup busGroup;
	private BusDept busDept;
	private District district;
	private Area area;
	private Position position;
	private BusGroup busGroup_1;
	private BusDept busDept_1;
	private District district_1;
	private Area area_1;
	private Position position_1;
	private Date calledTime;
	private String createdby;

	// Constructors

	/** default constructor */
	public CalledId() {
	}

	/** full constructor */
	public CalledId(Long id, Integer empno, BusGroup busGroup, BusDept busDept,
			District district, Area area, Position position,
			BusGroup busGroup_1, BusDept busDept_1, District district_1,
			Area area_1, Position position_1, Date calledTime, String createdby) {
		this.id = id;
		this.empno = empno;
		this.busGroup = busGroup;
		this.busDept = busDept;
		this.district = district;
		this.area = area;
		this.position = position;
		this.busGroup_1 = busGroup_1;
		this.busDept_1 = busDept_1;
		this.district_1 = district_1;
		this.area_1 = area_1;
		this.position_1 = position_1;
		this.calledTime = calledTime;
		this.createdby = createdby;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public BusGroup getBusGroup() {
		return this.busGroup;
	}

	public void setBusGroup(BusGroup busGroup) {
		this.busGroup = busGroup;
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

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public BusGroup getBusGroup_1() {
		return this.busGroup_1;
	}

	public void setBusGroup_1(BusGroup busGroup_1) {
		this.busGroup_1 = busGroup_1;
	}

	public BusDept getBusDept_1() {
		return this.busDept_1;
	}

	public void setBusDept_1(BusDept busDept_1) {
		this.busDept_1 = busDept_1;
	}

	public District getDistrict_1() {
		return this.district_1;
	}

	public void setDistrict_1(District district_1) {
		this.district_1 = district_1;
	}

	public Area getArea_1() {
		return this.area_1;
	}

	public void setArea_1(Area area_1) {
		this.area_1 = area_1;
	}

	public Position getPosition_1() {
		return this.position_1;
	}

	public void setPosition_1(Position position_1) {
		this.position_1 = position_1;
	}

	public Date getCalledTime() {
		return this.calledTime;
	}

	public void setCalledTime(Date calledTime) {
		this.calledTime = calledTime;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CalledId))
			return false;
		CalledId castOther = (CalledId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getEmpno() == castOther.getEmpno()) || (this
						.getEmpno() != null && castOther.getEmpno() != null && this
						.getEmpno().equals(castOther.getEmpno())))
				&& ((this.getBusGroup() == castOther.getBusGroup()) || (this
						.getBusGroup() != null
						&& castOther.getBusGroup() != null && this
						.getBusGroup().equals(castOther.getBusGroup())))
				&& ((this.getBusDept() == castOther.getBusDept()) || (this
						.getBusDept() != null && castOther.getBusDept() != null && this
						.getBusDept().equals(castOther.getBusDept())))
				&& ((this.getDistrict() == castOther.getDistrict()) || (this
						.getDistrict() != null
						&& castOther.getDistrict() != null && this
						.getDistrict().equals(castOther.getDistrict())))
				&& ((this.getArea() == castOther.getArea()) || (this.getArea() != null
						&& castOther.getArea() != null && this.getArea()
						.equals(castOther.getArea())))
				&& ((this.getPosition() == castOther.getPosition()) || (this
						.getPosition() != null
						&& castOther.getPosition() != null && this
						.getPosition().equals(castOther.getPosition())))
				&& ((this.getBusGroup_1() == castOther.getBusGroup_1()) || (this
						.getBusGroup_1() != null
						&& castOther.getBusGroup_1() != null && this
						.getBusGroup_1().equals(castOther.getBusGroup_1())))
				&& ((this.getBusDept_1() == castOther.getBusDept_1()) || (this
						.getBusDept_1() != null
						&& castOther.getBusDept_1() != null && this
						.getBusDept_1().equals(castOther.getBusDept_1())))
				&& ((this.getDistrict_1() == castOther.getDistrict_1()) || (this
						.getDistrict_1() != null
						&& castOther.getDistrict_1() != null && this
						.getDistrict_1().equals(castOther.getDistrict_1())))
				&& ((this.getArea_1() == castOther.getArea_1()) || (this
						.getArea_1() != null && castOther.getArea_1() != null && this
						.getArea_1().equals(castOther.getArea_1())))
				&& ((this.getPosition_1() == castOther.getPosition_1()) || (this
						.getPosition_1() != null
						&& castOther.getPosition_1() != null && this
						.getPosition_1().equals(castOther.getPosition_1())))
				&& ((this.getCalledTime() == castOther.getCalledTime()) || (this
						.getCalledTime() != null
						&& castOther.getCalledTime() != null && this
						.getCalledTime().equals(castOther.getCalledTime())))
				&& ((this.getCreatedby() == castOther.getCreatedby()) || (this
						.getCreatedby() != null
						&& castOther.getCreatedby() != null && this
						.getCreatedby().equals(castOther.getCreatedby())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getEmpno() == null ? 0 : this.getEmpno().hashCode());
		result = 37 * result
				+ (getBusGroup() == null ? 0 : this.getBusGroup().hashCode());
		result = 37 * result
				+ (getBusDept() == null ? 0 : this.getBusDept().hashCode());
		result = 37 * result
				+ (getDistrict() == null ? 0 : this.getDistrict().hashCode());
		result = 37 * result
				+ (getArea() == null ? 0 : this.getArea().hashCode());
		result = 37 * result
				+ (getPosition() == null ? 0 : this.getPosition().hashCode());
		result = 37
				* result
				+ (getBusGroup_1() == null ? 0 : this.getBusGroup_1()
						.hashCode());
		result = 37 * result
				+ (getBusDept_1() == null ? 0 : this.getBusDept_1().hashCode());
		result = 37
				* result
				+ (getDistrict_1() == null ? 0 : this.getDistrict_1()
						.hashCode());
		result = 37 * result
				+ (getArea_1() == null ? 0 : this.getArea_1().hashCode());
		result = 37
				* result
				+ (getPosition_1() == null ? 0 : this.getPosition_1()
						.hashCode());
		result = 37
				* result
				+ (getCalledTime() == null ? 0 : this.getCalledTime()
						.hashCode());
		result = 37 * result
				+ (getCreatedby() == null ? 0 : this.getCreatedby().hashCode());
		return result;
	}

}
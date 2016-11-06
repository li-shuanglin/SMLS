package entity;

/**
 * RecruitDestination entity. @author MyEclipse Persistence Tools
 */

public class RecruitDestination implements java.io.Serializable {

	// Fields

	private Long id;
	private RecruitPlan recruitPlan;
	private Dept dept;
	private Position position;
	private Short num;
	private String extrainto;

	// Constructors

	/** default constructor */
	public RecruitDestination() {
	}

	/** full constructor */
	public RecruitDestination(RecruitPlan recruitPlan, Dept dept,
			Position position, Short num, String extrainto) {
		this.recruitPlan = recruitPlan;
		this.dept = dept;
		this.position = position;
		this.num = num;
		this.extrainto = extrainto;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RecruitPlan getRecruitPlan() {
		return this.recruitPlan;
	}

	public void setRecruitPlan(RecruitPlan recruitPlan) {
		this.recruitPlan = recruitPlan;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Short getNum() {
		return this.num;
	}

	public void setNum(Short num) {
		this.num = num;
	}

	public String getExtrainto() {
		return this.extrainto;
	}

	public void setExtrainto(String extrainto) {
		this.extrainto = extrainto;
	}

}
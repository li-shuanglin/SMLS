package entity;

import java.util.Date;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Long id;
	private Users usersByReview;
	private Users usersByCender;
	private DataDictionary dataDictionary;
	private Boolean state;
	private Long objId;
	private Date cretaeTime;

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(Users usersByReview, Users usersByCender,
			DataDictionary dataDictionary, Boolean state, Long objId,
			Date cretaeTime) {
		this.usersByReview = usersByReview;
		this.usersByCender = usersByCender;
		this.dataDictionary = dataDictionary;
		this.state = state;
		this.objId = objId;
		this.cretaeTime = cretaeTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsersByReview() {
		return this.usersByReview;
	}

	public void setUsersByReview(Users usersByReview) {
		this.usersByReview = usersByReview;
	}

	public Users getUsersByCender() {
		return this.usersByCender;
	}

	public void setUsersByCender(Users usersByCender) {
		this.usersByCender = usersByCender;
	}

	public DataDictionary getDataDictionary() {
		return this.dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Date getCretaeTime() {
		return this.cretaeTime;
	}

	public void setCretaeTime(Date cretaeTime) {
		this.cretaeTime = cretaeTime;
	}

}
package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Train entity. @author MyEclipse Persistence Tools
 */

public class Train implements java.io.Serializable {

	// Fields

	private Long id;
	private DataDictionary dataDictionaryByTrainType;
	private DataDictionary dataDictionaryByTrainState;
	private String createby;
	private String trainby;
	private Date startTime;
	private Date endTime;
	private Set briefs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Train() {
	}

	/** full constructor */
	public Train(DataDictionary dataDictionaryByTrainType,
			DataDictionary dataDictionaryByTrainState, String createby,
			String trainby, Date startTime, Date endTime, Set briefs) {
		this.dataDictionaryByTrainType = dataDictionaryByTrainType;
		this.dataDictionaryByTrainState = dataDictionaryByTrainState;
		this.createby = createby;
		this.trainby = trainby;
		this.startTime = startTime;
		this.endTime = endTime;
		this.briefs = briefs;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DataDictionary getDataDictionaryByTrainType() {
		return this.dataDictionaryByTrainType;
	}

	public void setDataDictionaryByTrainType(
			DataDictionary dataDictionaryByTrainType) {
		this.dataDictionaryByTrainType = dataDictionaryByTrainType;
	}

	public DataDictionary getDataDictionaryByTrainState() {
		return this.dataDictionaryByTrainState;
	}

	public void setDataDictionaryByTrainState(
			DataDictionary dataDictionaryByTrainState) {
		this.dataDictionaryByTrainState = dataDictionaryByTrainState;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getTrainby() {
		return this.trainby;
	}

	public void setTrainby(String trainby) {
		this.trainby = trainby;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Set getBriefs() {
		return this.briefs;
	}

	public void setBriefs(Set briefs) {
		this.briefs = briefs;
	}

}
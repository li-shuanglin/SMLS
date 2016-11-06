package entity;

import java.util.Date;

/**
 * WorkLog entity. @author MyEclipse Persistence Tools
 */

public class WorkLog implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private String title;
	private String content;
	private Date createTime;
	private Boolean state;

	// Constructors

	/** default constructor */
	public WorkLog() {
	}

	/** full constructor */
	public WorkLog(Users users, String title, String content, Date createTime,
			Boolean state) {
		this.users = users;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.state = state;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
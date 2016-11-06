package entity;

import java.util.Date;

/**
 * Backlog entity. @author MyEclipse Persistence Tools
 */

public class Backlog implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private String content;
	private Date createTime;
	private String title;
	private Boolean state;

	// Constructors

	/** default constructor */
	public Backlog() {
	}

	/** full constructor */
	public Backlog(Users users, String content, Date createTime, String title,
			Boolean state) {
		this.users = users;
		this.content = content;
		this.createTime = createTime;
		this.title = title;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
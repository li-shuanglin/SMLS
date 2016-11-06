package entity;

import java.util.Date;
//  µ±º”∑÷ø©
/**
 * Announcement entity. @author MyEclipse Persistence Tools
 */

public class Announcement implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private String title;
	private String content;
	private Date createTime;

	// Constructors

	/** default constructor */
	public Announcement() {
	}

	/** full constructor */
	public Announcement(Users users, String title, String content,
			Date createTime) {
		this.users = users;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
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

}
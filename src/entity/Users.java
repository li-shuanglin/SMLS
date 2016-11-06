package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Short id;
	private Role role;
	private String name;
	private String password;
	private Set announcements = new HashSet(0);
	private Set noticesForReview = new HashSet(0);
	private Set workLogs = new HashSet(0);
	private Set backlogs = new HashSet(0);
	private Set empReturnVisits = new HashSet(0);
	private Set notes = new HashSet(0);
	private Set noticesForCender = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Role role, String name, String password) {
		this.role = role;
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public Users(Role role, String name, String password, Set announcements,
			Set noticesForReview, Set workLogs, Set backlogs,
			Set empReturnVisits, Set notes, Set noticesForCender) {
		this.role = role;
		this.name = name;
		this.password = password;
		this.announcements = announcements;
		this.noticesForReview = noticesForReview;
		this.workLogs = workLogs;
		this.backlogs = backlogs;
		this.empReturnVisits = empReturnVisits;
		this.notes = notes;
		this.noticesForCender = noticesForCender;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set announcements) {
		this.announcements = announcements;
	}

	public Set getNoticesForReview() {
		return this.noticesForReview;
	}

	public void setNoticesForReview(Set noticesForReview) {
		this.noticesForReview = noticesForReview;
	}

	public Set getWorkLogs() {
		return this.workLogs;
	}

	public void setWorkLogs(Set workLogs) {
		this.workLogs = workLogs;
	}

	public Set getBacklogs() {
		return this.backlogs;
	}

	public void setBacklogs(Set backlogs) {
		this.backlogs = backlogs;
	}

	public Set getEmpReturnVisits() {
		return this.empReturnVisits;
	}

	public void setEmpReturnVisits(Set empReturnVisits) {
		this.empReturnVisits = empReturnVisits;
	}

	public Set getNotes() {
		return this.notes;
	}

	public void setNotes(Set notes) {
		this.notes = notes;
	}

	public Set getNoticesForCender() {
		return this.noticesForCender;
	}

	public void setNoticesForCender(Set noticesForCender) {
		this.noticesForCender = noticesForCender;
	}

}
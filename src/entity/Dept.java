package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Set recruitDestinations = new HashSet(0);
	private Set positions = new HashSet(0);
	private Set briefs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String name, Set recruitDestinations, Set positions, Set briefs) {
		this.name = name;
		this.recruitDestinations = recruitDestinations;
		this.positions = positions;
		this.briefs = briefs;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getRecruitDestinations() {
		return this.recruitDestinations;
	}

	public void setRecruitDestinations(Set recruitDestinations) {
		this.recruitDestinations = recruitDestinations;
	}

	public Set getPositions() {
		return this.positions;
	}

	public void setPositions(Set positions) {
		this.positions = positions;
	}

	public Set getBriefs() {
		return this.briefs;
	}

	public void setBriefs(Set briefs) {
		this.briefs = briefs;
	}

}
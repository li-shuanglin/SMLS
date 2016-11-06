package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * LevelRank entity. @author MyEclipse Persistence Tools
 */

public class LevelRank implements java.io.Serializable {

	// Fields

	private Byte id;
	private String name;
	private Set employeeInfos = new HashSet(0);
	private Set salaries = new HashSet(0);

	// Constructors

	/** default constructor */
	public LevelRank() {
	}

	/** full constructor */
	public LevelRank(String name, Set employeeInfos, Set salaries) {
		this.name = name;
		this.employeeInfos = employeeInfos;
		this.salaries = salaries;
	}

	// Property accessors

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(Set employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

	public Set getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

}
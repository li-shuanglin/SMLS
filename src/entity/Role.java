package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Byte id;
	private String name;
	private Boolean flag;
	private Set userses = new HashSet(0);
	private Set rights = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String name, Boolean flag, Set userses, Set rights) {
		this.name = name;
		this.flag = flag;
		this.userses = userses;
		this.rights = rights;
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

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getRights() {
		return this.rights;
	}

	public void setRights(Set rights) {
		this.rights = rights;
	}

}
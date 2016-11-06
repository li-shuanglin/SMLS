package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Right entity. @author MyEclipse Persistence Tools
 */

public class Right implements java.io.Serializable {

	// Fields

	private String code;
	private String text;
	private String parentCode;
	private String type;
	private String url;
	private Set roles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Right() {
	}

	/** full constructor */
	public Right(String text, String parentCode, String type, String url,
			Set roles) {
		this.text = text;
		this.parentCode = parentCode;
		this.type = type;
		this.url = url;
		this.roles = roles;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

}
package com.volunteerSystem.po;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer admId;
	private Academy academy;
	private String admName;
	private String admPwd;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String admName, String admPwd) {
		this.admName = admName;
		this.admPwd = admPwd;
	}

	/** full constructor */
	public Admin(Academy academy, String admName, String admPwd) {
		this.academy = academy;
		this.admName = admName;
		this.admPwd = admPwd;
	}

	// Property accessors

	public Integer getAdmId() {
		return this.admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public Academy getAcademy() {
		return this.academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public String getAdmName() {
		return this.admName;
	}

	public void setAdmName(String admName) {
		this.admName = admName;
	}

	public String getAdmPwd() {
		return this.admPwd;
	}

	public void setAdmPwd(String admPwd) {
		this.admPwd = admPwd;
	}

}
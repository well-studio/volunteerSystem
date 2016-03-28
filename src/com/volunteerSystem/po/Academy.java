package com.volunteerSystem.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Academy entity. @author MyEclipse Persistence Tools
 */

public class Academy implements java.io.Serializable {

	// Fields

	private Integer acaId;
	private String acaName;
	private String acaMan;
	private String acaManTel;
	private Set students = new HashSet(0);
	private Set activities = new HashSet(0);
	private Set admins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Academy() {
	}

	/** minimal constructor */
	public Academy(String acaName, String acaMan, String acaManTel) {
		this.acaName = acaName;
		this.acaMan = acaMan;
		this.acaManTel = acaManTel;
	}

	/** full constructor */
	public Academy(String acaName, String acaMan, String acaManTel,
			Set students, Set activities, Set admins) {
		this.acaName = acaName;
		this.acaMan = acaMan;
		this.acaManTel = acaManTel;
		this.students = students;
		this.activities = activities;
		this.admins = admins;
	}

	// Property accessors

	public Integer getAcaId() {
		return this.acaId;
	}

	public void setAcaId(Integer acaId) {
		this.acaId = acaId;
	}

	public String getAcaName() {
		return this.acaName;
	}

	public void setAcaName(String acaName) {
		this.acaName = acaName;
	}

	public String getAcaMan() {
		return this.acaMan;
	}

	public void setAcaMan(String acaMan) {
		this.acaMan = acaMan;
	}

	public String getAcaManTel() {
		return this.acaManTel;
	}

	public void setAcaManTel(String acaManTel) {
		this.acaManTel = acaManTel;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getActivities() {
		return this.activities;
	}

	public void setActivities(Set activities) {
		this.activities = activities;
	}

	public Set getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set admins) {
		this.admins = admins;
	}

}
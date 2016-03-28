package com.volunteerSystem.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Activity entity. @author MyEclipse Persistence Tools
 */

public class Activity implements java.io.Serializable {

	// Fields

	private Integer actId;
	private Academy academy;
	private String actTitle;
	private String actContent;
	private Date actStartTime;
	private Date actEndTime;
	private String actState;
	private Set actStuRelations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Activity() {
	}

	/** minimal constructor */
	public Activity(String actTitle, String actContent, Date actStartTime,
			Date actEndTime, String actState) {
		this.actTitle = actTitle;
		this.actContent = actContent;
		this.actStartTime = actStartTime;
		this.actEndTime = actEndTime;
		this.actState = actState;
	}

	/** full constructor */
	public Activity(Academy academy, String actTitle, String actContent,
			Date actStartTime, Date actEndTime, String actState,
			Set actStuRelations) {
		this.academy = academy;
		this.actTitle = actTitle;
		this.actContent = actContent;
		this.actStartTime = actStartTime;
		this.actEndTime = actEndTime;
		this.actState = actState;
		this.actStuRelations = actStuRelations;
	}

	// Property accessors

	public Integer getActId() {
		return this.actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public Academy getAcademy() {
		return this.academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public String getActTitle() {
		return this.actTitle;
	}

	public void setActTitle(String actTitle) {
		this.actTitle = actTitle;
	}

	public String getActContent() {
		return this.actContent;
	}

	public void setActContent(String actContent) {
		this.actContent = actContent;
	}

	public Date getActStartTime() {
		return this.actStartTime;
	}

	public void setActStartTime(Date actStartTime) {
		this.actStartTime = actStartTime;
	}

	public Date getActEndTime() {
		return this.actEndTime;
	}

	public void setActEndTime(Date actEndTime) {
		this.actEndTime = actEndTime;
	}

	public String getActState() {
		return this.actState;
	}

	public void setActState(String actState) {
		this.actState = actState;
	}

	public Set getActStuRelations() {
		return this.actStuRelations;
	}

	public void setActStuRelations(Set actStuRelations) {
		this.actStuRelations = actStuRelations;
	}

}
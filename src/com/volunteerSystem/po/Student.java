package com.volunteerSystem.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer stuId;
	private Academy academy;
	private String stuPwd;
	private String stuName;
	private String stuSex;
	private String stuTel;
	private String stuQq;
	private Set actStuRelations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuPwd, String stuName, String stuSex) {
		this.stuPwd = stuPwd;
		this.stuName = stuName;
		this.stuSex = stuSex;
	}

	/** full constructor */
	public Student(Academy academy, String stuPwd, String stuName,
			String stuSex, String stuTel, String stuQq, Set actStuRelations) {
		this.academy = academy;
		this.stuPwd = stuPwd;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuTel = stuTel;
		this.stuQq = stuQq;
		this.actStuRelations = actStuRelations;
	}

	// Property accessors

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Academy getAcademy() {
		return this.academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public String getStuPwd() {
		return this.stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuTel() {
		return this.stuTel;
	}

	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	public String getStuQq() {
		return this.stuQq;
	}

	public void setStuQq(String stuQq) {
		this.stuQq = stuQq;
	}

	public Set getActStuRelations() {
		return this.actStuRelations;
	}

	public void setActStuRelations(Set actStuRelations) {
		this.actStuRelations = actStuRelations;
	}

}
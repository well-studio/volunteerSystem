package com.volunteerSystem.po;

/**
 * ActStuRelation entity. @author MyEclipse Persistence Tools
 */

public class ActStuRelation implements java.io.Serializable {

	// Fields

	private ActStuRelationId id;
	private Student student;
	private Activity activity;

	// Constructors

	/** default constructor */
	public ActStuRelation() {
	}

	/** full constructor */
	public ActStuRelation(ActStuRelationId id, Student student,
			Activity activity) {
		this.id = id;
		this.student = student;
		this.activity = activity;
	}

	// Property accessors

	public ActStuRelationId getId() {
		return this.id;
	}

	public void setId(ActStuRelationId id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}
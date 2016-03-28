package com.volunteerSystem.po;

/**
 * ActStuRelationId entity. @author MyEclipse Persistence Tools
 */

public class ActStuRelationId implements java.io.Serializable {

	// Fields

	private Integer stuId;
	private Integer actId;

	// Constructors

	/** default constructor */
	public ActStuRelationId() {
	}

	/** full constructor */
	public ActStuRelationId(Integer stuId, Integer actId) {
		this.stuId = stuId;
		this.actId = actId;
	}

	// Property accessors

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Integer getActId() {
		return this.actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActStuRelationId))
			return false;
		ActStuRelationId castOther = (ActStuRelationId) other;

		return ((this.getStuId() == castOther.getStuId()) || (this.getStuId() != null
				&& castOther.getStuId() != null && this.getStuId().equals(
				castOther.getStuId())))
				&& ((this.getActId() == castOther.getActId()) || (this
						.getActId() != null && castOther.getActId() != null && this
						.getActId().equals(castOther.getActId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStuId() == null ? 0 : this.getStuId().hashCode());
		result = 37 * result
				+ (getActId() == null ? 0 : this.getActId().hashCode());
		return result;
	}

}
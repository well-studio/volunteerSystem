package com.volunteerSystem.action;

import com.opensymphony.xwork2.ActionSupport;
import com.volunteerSystem.po.Student;
import com.volunteerSystem.service.StudentService;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = -1216943637040891212L;
	private Student student;
	private StudentService studentService;
	private String rePwd;
	
	
	public String getRePwd() {
		return rePwd;
	}
	public void setRePwd(String rePwd) {
		this.rePwd = rePwd;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String execute() throws Exception{
		if( studentService.register(student) ){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
}

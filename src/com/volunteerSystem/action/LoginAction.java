package com.volunteerSystem.action;

import com.opensymphony.xwork2.ActionSupport;
import com.volunteerSystem.po.Admin;
import com.volunteerSystem.po.Student;
import com.volunteerSystem.service.AdminService;
import com.volunteerSystem.service.StudentService;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = -5719674890122734791L;
	private Student student;
	private Admin admin;
	private StudentService studentService;
	private AdminService adminService;
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
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
	
	public String userLogin() throws Exception{
		if( studentService.login(student) ){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	

	public String adminLogin() throws Exception{
		if( adminService.login(admin) ){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
}

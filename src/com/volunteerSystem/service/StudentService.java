package com.volunteerSystem.service;

import com.volunteerSystem.po.Student;

public interface StudentService {
	//登陆检查
	public boolean login(Student stu);
	
	//注册
	public boolean register(Student stu);
	
	//更新信心
	public void updateInfo(Student stu);
	
	//查找学生
	public Student find(int id);
	
}

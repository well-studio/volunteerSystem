package com.volunteerSystem.service;

import com.volunteerSystem.po.Student;

public interface StudentService {
	//��½���
	public boolean login(Student stu);
	
	//ע��
	public boolean register(Student stu);
	
	//��������
	public void updateInfo(Student stu);
	
	//����ѧ��
	public Student find(int id);
	
}

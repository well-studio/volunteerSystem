package com.volunteerSystem.dao;

import com.volunteerSystem.po.Student;

public interface StudentDao {
	//��ѯ
	public Student findById(int id);
	
	//ɾ��
	public void delete(Student stu);
	
	//����
	public void save(Student stu);
	
	//����
	public void update(Student stu);
	
}

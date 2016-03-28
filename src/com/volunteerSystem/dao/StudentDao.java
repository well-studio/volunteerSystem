package com.volunteerSystem.dao;

import com.volunteerSystem.po.Student;

public interface StudentDao {
	//查询
	public Student findById(int id);
	
	//删除
	public void delete(Student stu);
	
	//增加
	public void save(Student stu);
	
	//更新
	public void update(Student stu);
	
}

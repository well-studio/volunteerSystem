package com.volunteerSystem.service;

import com.volunteerSystem.dao.StudentDao;
import com.volunteerSystem.po.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public boolean login(Student stu) {
		//�����ݿ��в��Ҹ���
		Student student = studentDao.findById(stu.getStuId());
		//�����ѧ�������ڻ������벻��
		if(student == null || !student.getStuPwd().equals(stu.getStuPwd())){
			return false;
		}else{
			return true;
		}
	}

	public boolean register(Student stu) {
		//�����ݿ��в��Ҹ���
		Student student = studentDao.findById(stu.getStuId());
		//�����ѧ������
		if(student != null ){
			return false;
		}else{
			studentDao.save(student);
			return true;
		}
	}

	public void updateInfo(Student stu) {
		studentDao.update(stu);
	}

	public Student find(int id) {
		studentDao.findById(id);
		return null;
	}

}

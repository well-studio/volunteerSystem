package com.volunteerSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.volunteerSystem.po.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public Student findById(int id) {
		String queryString = "SELECT stu FROM Student stu WHERE stu.stuId=?";
		List result = this.getHibernateTemplate().find(queryString, id);
		return (Student) (result.size() == 0 ?  null :  result.get(0));
	}

	public void delete(Student stu) {
		this.getHibernateTemplate().delete(stu);
	}

	public void save(Student stu) { 
		this.getHibernateTemplate().save(stu);
	}

	public void update(Student stu) {
		this.getHibernateTemplate().update(stu);
	}

}

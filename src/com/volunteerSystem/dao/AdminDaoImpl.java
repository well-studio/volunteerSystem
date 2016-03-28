package com.volunteerSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.volunteerSystem.po.Admin;
import com.volunteerSystem.po.Student;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public Admin findById(int id) {
		String queryString = "SELECT adm FROM Admin adm WHERE adm.admId=?";
		List l = this.getHibernateTemplate().find(queryString, id);
		return (Admin) (l.size() == 0?  null :  l.get(0));
	}

	public void delete(Admin adm) {
		this.getHibernateTemplate().delete(adm);
	}

	public void save(Admin adm) { 
		this.getHibernateTemplate().save(adm);
	}

	public void update(Admin adm) {
		this.getHibernateTemplate().update(adm);
	}

}

package com.volunteerSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.volunteerSystem.po.Academy;

public class AcademyDaoImpl extends HibernateDaoSupport implements AcademyDao {

	public Academy findById(int id) {
		String queryString = "SELECT aca FROM Academy aca WHERE aca.actId=?";
		List l = this.getHibernateTemplate().find(queryString, id);
		return (Academy) (l == null ?  null :  l.get(0));
	}

	public void delete(Academy aca) {
		this.getHibernateTemplate().delete(aca);
	}

	public void save(Academy aca) {
		this.getHibernateTemplate().save(aca);
	}

	public void update(Academy aca) {
		this.getHibernateTemplate().update(aca);
	}

}

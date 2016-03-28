package com.volunteerSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.volunteerSystem.po.Activity;
import com.volunteerSystem.po.Admin;
import com.volunteerSystem.po.Student;

public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {

	public Activity findById(int id) {
		String queryString = "SELECT act FROM Activity act WHERE act.actId=?";
		List l = this.getHibernateTemplate().find(queryString, id);
		return (Activity) (l.size() == 0 ?  null :  l.get(0));
	}

	public void delete(Activity act) {
		this.getHibernateTemplate().delete(act);
	}

	public void save(Activity act) { 
		this.getHibernateTemplate().save(act);
	}

	public void update(Activity act) {
		this.getHibernateTemplate().update(act);
	}

	public List<Activity> getAll() {
		String queryString = "SELECT act FROM Activity act";
		List l = this.getHibernateTemplate().find(queryString);
		return  l.size() == 0 ?  null :  l;
	}

	public Activity findByTitle(String title) {
		String queryString = "SELECT act FROM Activity act WHERE act.actTitle=?";
		List l = this.getHibernateTemplate().find(queryString, title);
		return (Activity) (l.size() == 0 ?  null :  l.get(0));
	}


}

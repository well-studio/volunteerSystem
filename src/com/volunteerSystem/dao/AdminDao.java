package com.volunteerSystem.dao;

import com.volunteerSystem.po.Admin;

public interface AdminDao {
	//查询
	public Admin findById(int id);
	
	//删除
	public void delete(Admin adm);
	
	//增加
	public void save(Admin adm);
	
	//更新
	public void update(Admin adm);
	
}

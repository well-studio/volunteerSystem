package com.volunteerSystem.dao;

import com.volunteerSystem.po.Admin;

public interface AdminDao {
	//��ѯ
	public Admin findById(int id);
	
	//ɾ��
	public void delete(Admin adm);
	
	//����
	public void save(Admin adm);
	
	//����
	public void update(Admin adm);
	
}

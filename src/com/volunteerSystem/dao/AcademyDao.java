package com.volunteerSystem.dao;

import com.volunteerSystem.po.Academy;

public interface AcademyDao {
	//��ѯ
	public Academy findById(int id);
	
	//ɾ��
	public void delete(Academy aca);
	
	//����
	public void save(Academy aca);
	
	//����
	public void update(Academy aca);
	
}

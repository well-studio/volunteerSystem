package com.volunteerSystem.dao;

import java.util.List;

import com.volunteerSystem.po.Activity;

public interface ActivityDao {
	//��ѯ
	public Activity findById(int id);

	//��ѯ
	public Activity findByTitle(String title);
	
	//ɾ��
	public void delete (Activity id);
	
	//����
	public void save(Activity stu);
	
	//����
	public void update(Activity stu);
	
	//�õ����еĻ
	public List<Activity> getAll();
	
}

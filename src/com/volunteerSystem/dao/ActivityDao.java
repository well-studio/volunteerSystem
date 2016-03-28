package com.volunteerSystem.dao;

import java.util.List;

import com.volunteerSystem.po.Activity;

public interface ActivityDao {
	//查询
	public Activity findById(int id);

	//查询
	public Activity findByTitle(String title);
	
	//删除
	public void delete (Activity id);
	
	//增加
	public void save(Activity stu);
	
	//更新
	public void update(Activity stu);
	
	//得到所有的活动
	public List<Activity> getAll();
	
}

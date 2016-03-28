package com.volunteerSystem.dao;

import com.volunteerSystem.po.Academy;

public interface AcademyDao {
	//查询
	public Academy findById(int id);
	
	//删除
	public void delete(Academy aca);
	
	//增加
	public void save(Academy aca);
	
	//更新
	public void update(Academy aca);
	
}

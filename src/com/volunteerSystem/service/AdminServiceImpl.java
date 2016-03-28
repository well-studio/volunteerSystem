package com.volunteerSystem.service;

import com.volunteerSystem.dao.AdminDao;
import com.volunteerSystem.po.Admin;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	
	public boolean login(Admin adm) {
		//查找该管理员
		Admin admin = adminDao.findById(adm.getAdmId());
		if(admin == null || !admin.getAdmPwd().equals(adm.getAdmPwd())){
			return false;
		}else{
			return true;
		}
	}
}

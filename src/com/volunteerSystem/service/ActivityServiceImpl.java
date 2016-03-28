package com.volunteerSystem.service;

import java.util.List;

import com.volunteerSystem.dao.ActivityDao;
import com.volunteerSystem.po.Activity;
import com.volunteerSystem.service.ActivityService;

public class ActivityServiceImpl implements ActivityService {
	private ActivityDao activityDao;
	
	public ActivityDao getActivityDao() {
		return activityDao;
	}

	public void setActivityDao(ActivityDao activityDao) {
		this.activityDao = activityDao;
	}

	public List<Activity> getAll() {
		return activityDao.getAll();
	}

}

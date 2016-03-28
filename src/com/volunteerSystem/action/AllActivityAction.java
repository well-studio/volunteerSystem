package com.volunteerSystem.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.volunteerSystem.po.Activity;
import com.volunteerSystem.service.ActivityService;

public class AllActivityAction extends ActionSupport {
	private static final long serialVersionUID = -6648489576310925199L;
	private ActivityService activityService;
	private List<Activity> allActivities;

	public List<Activity> getAllActivities() {
		return allActivities;
	}
	public void setAllActivities(List<Activity> allActivities) {
		this.allActivities = allActivities;
	}
	public ActivityService getActivityService() {
		return activityService;
	}
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}
	
	public String execute() throws Exception{
		allActivities = activityService.getAll();
		return SUCCESS;
	}
	
}

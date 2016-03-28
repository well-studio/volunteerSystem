package com.volunteerSystem.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.volunteerSystem.po.Activity;
import com.volunteerSystem.service.ActivityService;

public class UploadAction extends ActionSupport {
	private static final long serialVersionUID = -7034703330928263851L;
	private Activity activity;
	private File img;
	private String imgContentType;
	private String imgFileName;
	private ActivityService activityService;
	
	
	public ActivityService getActivityService() {
		return activityService;
	}

	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getImgContentType() {
		return imgContentType;
	}

	public void setImgContentType(String imgContentType) {
		this.imgContentType = imgContentType;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}


	public String execute() throws Exception{
			return ERROR;
	}
	
	public String upload() throws Exception{
		//设置文件保存目录
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
//		//解决中文文件名问题
		String extension = FilenameUtils.getExtension(this.getImgFileName());
		String fileName = new String(new Date().getTime() +'.'+ extension);
		//设置目标文件
		File destFile = new File(root,fileName);
		//输入流
		InputStream is = new FileInputStream(img);
		//使用输出流来包装目标文件
		OutputStream os = new FileOutputStream(destFile);
		byte[] buffer = new byte[1024];
		int length = 0;
		while((length = is.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}
		//关闭流
		is.close();
		os.close();
		
		return SUCCESS;
	}
}

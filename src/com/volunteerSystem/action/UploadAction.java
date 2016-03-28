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
		//�����ļ�����Ŀ¼
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
//		//��������ļ�������
		String extension = FilenameUtils.getExtension(this.getImgFileName());
		String fileName = new String(new Date().getTime() +'.'+ extension);
		//����Ŀ���ļ�
		File destFile = new File(root,fileName);
		//������
		InputStream is = new FileInputStream(img);
		//ʹ�����������װĿ���ļ�
		OutputStream os = new FileOutputStream(destFile);
		byte[] buffer = new byte[1024];
		int length = 0;
		while((length = is.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}
		//�ر���
		is.close();
		os.close();
		
		return SUCCESS;
	}
}

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>上传</title>
  </head>
  
  <body>
  	<s:form action="upload.action" method="post" validate="true" enctype="multipart/form-data">
  		<s:textfield name="activity.actTitle" label="活动标题"/>
  		<s:textfield name="activity.actStartTime" label="活动开始时间"/>
  		<s:textfield name="activity.actEndTime" label="活动结束时间"/>
  		<s:textfield name="activity.actContent" label="活动内容"/>
  		<s:file name="img" label="选择图片" />
  		<s:submit label="上传" align="center" />
  	</s:form>
  </body>
</html>

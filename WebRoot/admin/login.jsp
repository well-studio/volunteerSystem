<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>登陆</title>
  </head>
  
  <body>
  	<s:form action="login.action" method="post" validate="true">
  		<s:textfield name="admin.admId" label="账号"/>
  		<s:password name="admin.admPwd" label="密码"/>
  		<s:submit label="登陆"/>
  	</s:form>
  </body>
</html>

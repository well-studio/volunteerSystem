<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>注册</title>
  </head>
  
  <body>
  	<s:form action="register.action" method="post" validate="true">
  		<s:textfield name="student.stuId" label="学号"/>
  		<s:textfield name="student.stuName" label="姓名"/>
  		<s:password name="student.stuPwd" label="密码"/>
  		<s:password name="rePwd" label="确认密码"/>
  		<s:textfield name="student.stuTel" label="电话"/>
  		<s:textfield name="student.stuQq" label="QQ"/>
  		<s:submit label="注册"/>
  	</s:form>
  </body>
</html>

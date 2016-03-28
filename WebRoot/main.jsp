<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>湖南商学院志愿者平台</title>
  </head>
  
  <body>
   <!-- 画界面 -->
    <table width="60%" align="center">
    	<tr><td colspan="5" align="center">活动列表<td></tr>
    	<tr>
    		<td>活动标题</td>
    		<td>活动内容</td>
    		<td>活动开始时间</td>
    		<td>活动结束时间</td>
    	</tr>
    	<!-- 拿到数据，展示数据 -->
    	
    	<s:iterator value="allActivities">
    		<tr>
    			<td><s:property value="actTitle"/></td>
    			<td><s:property value="actContent"/></td>
    			<td><s:property value="actStartTime"/></td>
    			<td><s:property value="actEndTime"/></td>
    		 </tr>
    	</s:iterator>
    </table>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'a.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>向session域中保存数据</h1>
    <%
        session.setAttribute("aaa", "AAA");
    %>
    系统变量:
    <s:property value="@java.lang.System@getenv('OS')"/><br/>
  </body>
  <table width="200" border="1">
  <s:iterator value="{'ff','dd','rr','rrt','gg'}" id="name" status="st">
      <tr>
          <td><s:property value="#st.count"/></td>
          <td><s:property value="name"/></td>
          
      </tr>
  </s:iterator>
  </table>
</html>

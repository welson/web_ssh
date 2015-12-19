<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="row nav">
	<div class="col-sm-1 navbar-header">
	LOGO
	</div>
	<div class="col-sm-10">
	header
	</div>
	<div class="col-sm-1">
	<%
		HttpSession s =request.getSession();
		if(s.getAttribute("username")!=null) {
	%>
		<%=s.getAttribute("username") %>，欢迎您！
	<% 
		} else {
	%>
	<a href="Login.jsp">登陆</a>
	<%
		}
	%>
	</div>
</div>


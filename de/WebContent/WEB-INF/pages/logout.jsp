<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>

	<link rel="stylesheet" href="<c:url value = "/resources/css/errorStyle.css" />">

</head>
<body>
<h2 style="color: #ffffff" align="center"><%=request.getAttribute("logoutMessage").toString() %></h2><br>
<div><h2 style="color: #ffffff" align="center"> Login again </h2> <a href="/">click here</a></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Go Foodiy!!!!!</title>
<head>
	<meta charset="utf-8">

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

		<!--<link rel="stylesheet" href="<c:url value = "/resources/css/animate.css" />">-->
	
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="<c:url value = "/resources/css/style.css" />">
		<link rel="stylesheet" href="<c:url value = "/resources/css/footer.css" />">
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
<form action="index.htm" method="post">
	<div class="container">
		<div class="top">
			<h1 id="title"><span id="logo">I am  <span>Foodiy</span></span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<label for="username">Usernamee</label>
			<br/>
			<input type="text" id="username" name="username">
			<br/>
			<label for="password">Password</label>
			<br/>
			<input type="password" id="password" name="password">
			<br/>
			<input type="submit" value="Sign In"/>
			<br/>
			<a href="#"><p class="small">Forgot your password?</p></a>
			</br>
			<label>For business</label><a href="gotobusinesslogin.htm">Login here </a>
		</div>
		
		<div style="margin-top: 80px">
<div class="footer">
<div>
<p align="center" style="size: 5px">© 2017, Gofoodiy</p>
</div>
</div>
</div>
	</div>

</form>
<script>
	
</script>

</body>
</html>
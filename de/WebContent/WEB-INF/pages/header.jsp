<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!--  <link rel="stylesheet" href="<c:url value = "/resources/assests/demo.css" />">-->
		<link rel="stylesheet" href="<c:url value = "/resources/assests/header-user-dropdown.css" />">
		
</head>
<body>
<header class="header-user-dropdown">

	<div class="header-limiter">
		<h1><a href="#">GoFoodiy<span></span></a></h1>

		<nav>
			<a href="#" class="sans-serif-text" ng-click="getRestaurantSearchForm();">Restaurants</a>
			<a href="#" class="sans-serif-text" ng-click="getFoodSearchForm();">Food</a>
		    <a href="#" class="sans-serif-text" ng-click="getCuisineSearchForm();">Cuisine</a>
			<a href="#" class="sans-serif-text" ng-click="getonlineOrderDivForm();">Order Online</a>
			<!--  <a href="http://tutorialzine.com/2015/02/freebie-7-responsive-header-templates/" class="sans-serif-text">Download</a>-->
			
			<a href="#" class="sans-serif-text">Roles <span class="header-new-feature">new</span></a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
	<span class="sans-serif-text">Hi <%=request.getSession().getAttribute("username") %></span>
	<a href="#" class="sans-serif-text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="sans-serif-text header-new-feature"><%=request.getSession().getAttribute("location") %></span></a>
	
				<img src="<c:url value = "/resources/assests/800px-Flag_of_India.svg.png" />" alt="User Image" height="20px" width="38px"/>
	
	
			
		</nav>


		<div class="header-user-menu">
			<img src="<c:url value = "/resources/assests/2.jpg" />" alt="User Image"/>

			<ul>
				<li><a href="#">Settings</a></li>
				<li><a href="#">Payments</a></li>
				<li><a href="#" class="highlight" ng-click="sessionInvalidater();">Logout</a></li>
			</ul>
		</div>

	</div>

</header>
</body>
</html>
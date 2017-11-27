<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Gofoodiy</title>
	<!--  <link rel="stylesheet" href="<c:url value = "/resources/assests/demo.css" />">-->
		<link rel="stylesheet" href="<c:url value = "/resources/assests/header-user-dropdown.css" />">
	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	
	<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>
	 <!-- Font Awesome -->
  <link rel="stylesheet" href="resources/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="resources/bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="resources/dist/css/AdminLTE.min.css">
  <link rel="stylesheet" href= /resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
 
  <link rel="stylesheet" href="resources/dist/css/skins/skin-blue.min.css">
	
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<style>
@import url(https://fonts.googleapis.com/css?family=Open+Sans);

body{
  	background: url("./resources/images/iStock_90550255_LARGE.jpg") no-repeat center center fixed;
  	background-repeat: no-repeat;
background-position: center center;
    -webkit-animation: fadein 2s; /* Safari, Chrome and Opera > 12.1 */
background-size: cover;
  
  font-family: 'Open Sans', sans-serif;
}
div.tab {
   width:180px;
   height:25px;
    background-color: white;
    align:left;
}
.search {
  width: 100%;
  position: relative;
}


</style>

</head>

<body ng-app="" ng-controller="">

<jsp:include page="header.jsp"/>
<br>
<div style="width:700px ;height:300px ;background-color: white;border-radius:4px">
restaurant images
</div>



<div class="footer">
<div>
<p align="center" style="size: 5px">© 2017, Gofoodiy</p>
</div>
</div>
</body>
</html>
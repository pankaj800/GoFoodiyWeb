<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="businessApp">
<head>
  <meta charset="UTF-8">
  <title>Bootstrap Snippet: Login Form</title>
  
    <link rel="stylesheet" href="resources/dist/css/AdminLTE.min.css">
  
  <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>

 		<link rel="stylesheet" href="<c:url value = "/resources/css/businessloginstyle.css" />">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>

<body ng-controller="businesscontroller">
    <div class="wrapper">
    <form class="form-signin">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit" ng-click="signin();">Login</button>   
    </form>
  </div>
  
  <script type="text/javascript" src="<c:url value = "/resources/js/businesscontroller.js" />"></script>
   <!-- Main Footer -->
  <footer class="main-footer" style="margin-left:2px">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
      Anything you want
    </div>
    <!-- Default to the left -->
    <div align="center"><strong>Copyright &copy; 2016 <a href="/de">Gofoodiy</a>.</strong> All rights reserved.</div>
  </footer>
  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="extraApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body ng-controller="extracontroller">
this is the extra page
<a href="#"  ng-click="hello1();">link1</a>
<a href="#"  ng-click="hello2();">link2</a>
<a href="#" ng-click="hello3();">link3</a>
<div id="body"  style=" margin-left:80px ;height:500px;width:300px;background-color:yellow">
<div id="link1Id1" ng-if="linkflag1"><jsp:include page="../pages/link1.jsp"></jsp:include></div>
<div id="link1Id2" ng-if="linkflag2"><jsp:include page="../pages/link2.jsp"></jsp:include></div>
<div id="link1Id3" ng-if="linkflag3"><jsp:include page="../pages/link3.jsp"></jsp:include></div>

</div>


<script>

var extraApp = angular.module("extraApp", []);
extraApp.controller('extracontroller', function($scope) {
	
	$scope.linkflag1=false;
	$scope.linkflag2=false;
	$scope.linkflag3=false;

	
	$scope.hello1=function(){
		$scope.linkflag1=true;
		$scope.linkflag2=false;
		$scope.linkflag3=false;
		alert("link1");
	};
	
	$scope.hello2=function(){
		$scope.linkflag1=false;
		$scope.linkflag2=true;
		$scope.linkflag3=false;
		alert("link2");

	};
	
	$scope.hello3=function(){
		$scope.linkflag1=false;
		$scope.linkflag2=false;
		$scope.linkflag3=true;
		alert("link3");

	};
	$scope.poopop=function(){
alert("xgfxchgcgc");
	};
});
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <link href="/de/resources/css/searchbar.css" rel="stylesheet">
</head>
<body>

<ul class="nav">
    <li id="settings">
       
    </li>
    <li>
        <a href="#">Application</a>
    </li>
    <li>
        <a href="#">Board</a>
    </li>
    <li id="search">
        <form action="" method="get">
            <input type="text" name="search_text" id="search_text" placeholder="Search"/>
            <input type="button" name="search_button" id="search_button"></a>
        </form>
    </li>
    <li id="options">
        <a href="#">Options</a>
        <ul class="subnav">
            <li><a href="#">Settings</a></li>
            <li><a href="#">Application</a></li>
            <li><a href="#">Board</a></li>
            <li><a href="#">Options</a></li>
        </ul>
    </li>
</ul>
 
<script src="prefixfree-1.0.7.js" type="text/javascript"></script>
======================================================================== for modal display
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="mymodal">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout page</title>

<link rel="stylesheet"
	href="<c:url value = "/resources/css/errorStyle.css" />">

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

</head>
<body ng-controller="MainCtrl">
	<h2 style="color: #ffffff" align="center"><%=request.getAttribute("logoutMessage").toString()%></h2>
	<br>
	<h3 style="color: #ffffff" align="center">
		Login again <a href="/de"><span style="color: #F2910D">Click
				Here</span></a>
	</h3>
<button ng-click="toggleModal()" id="button id">success</button>


	<!--modal div start  -->
	
	<div style="width:400px;background-color: #ffffff" class="modal fade" id="viewModal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content" align="center">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
                        <h4 class="modal-title" id="myModalLabel">View vehicle Detail</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" name="viewuser">
                            <div class="form-group">
                                <label for="ID" class="col-sm-3 control-label">ID</label>
                                <div class="col-sm-7">
                                    vehicle.Id
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="Name" class="col-sm-3 control-label">Name</label>
                                <div class="col-sm-7">
                                    vehicle.Name
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="vehicleIdentificationAccountId" class="col-sm-3 control-label">Identification Account</label>
                                <div class="col-sm-7">
                                    vehicle.vehicleIdentificationAccountId
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
	
	<!-- modal div stop -->
        <!-- Scripts -->
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"></script>
	
<script type="text/javascript" src="<c:url value = "/resources/js/modal.js" />"></script>


</body>
</html>
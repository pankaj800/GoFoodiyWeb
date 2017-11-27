<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Get ur taste buds thrilled</title>
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
#restaurantNameId:hover{
cursor: pointer;
opacity:0.5;
}

div#showRestaurantsId:hover{
  -webkit-opacity: 0;

}
.ScrollStyle
 {
   overflow-y: scroll;
        max-height: 470px;
}
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
    border-radius: 10px;
}

::-webkit-scrollbar-thumb {
    border-radius: 10px;
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.5);
}
div.ScrollStyle::-webkit-scrollbar {
    width: 8px;
}
#restaurantImgId{
cursor:pointer;
opacity:1.5;
}
</style>
</head>

<body ng-app="loginApp" ng-controller="loginController">

<jsp:include page="header.jsp"/>

<!-- The content of your page would go here. -->


<div class="menu">

	<img src="<c:url value = "/resources/assests/demo-arrow.png" />" alt="arrow" height="120">

<!-- search bar -->
   <div class="wrap" align="center">
   <div class="search">
  
 <div id="foodSearchId" ng-show="foodSearchDivShow">
 <form ng-submit="searchForFoodInLocation();">
  <input type="text" class="sans-serif-text" name="locationName" id="locationsearchTermId1" ng-keyup="getPossibleCityNameByFood();" placeholder="Enter your location " ng-model="locationNameForFood.locationName" style="width: 250px; height: 30px;">
    <input type="text" class="sans-serif-text" name="foodName" id="foodsearchTermId"  placeholder="Enter your food choice" style="width: 250px; height: 30px;">
  <input type="submit" class="sans-serif-text" value="search" style="width: 80px;height: 36px;background-color: #3c3030;color:white">
  </form>
  </div>
  
  <div id="cuisineSearchId" ng-show="cuisineSearchDivShow">
 <form ng-submit="searchForCuisineInLocation();">
  <input class="sans-serif-text" type="text"  name="locationName" id="locationsearchTermId2" ng-keyup="getPossibleCityNameByCuisine();" placeholder="Enter your location " ng-model="locationNameForCuisine.locationName" style="width: 250px; height: 30px;">
    <input class="sans-serif-text" type="text"  name="cuisineName" id="cuisinesearchTermId"  placeholder="Enter your cuisine " style="width: 250px; height: 30px;">
  <input class="sans-serif-text" type="submit" value="search" style="width: 80px;height: 36px;background-color: #3c3030;color:white">
  </form>
  </div>
  
  <div id="restaurantSearchId" ng-show="restaurantSearchDivShow">
 <form ng-submit="searchForRestaurantInLocation();">
  <input class="sans-serif-text" type="text"  name="locationName" id="locationsearchTermId3" ng-keyup="getPossibleCityName();" placeholder="Enter your location " ng-model="locationNameForRestaurant.locationName" style="width: 510px; height: 30px;">
  <input class="sans-serif-text" type="submit" value="search" style="width: 80px;height: 36px;background-color: #3c3030;color:white">
  </form>
  </div>
  
  
   <div id="foodOrderOnlineId" ng-show="onlineOrderDivShow">
 <form ng-submit="searchForRestaurantforOrderOnline();">
 <!--  <input class="sans-serif-text" type="text"  name="locationName" id="locationsearchTermId4" ng-keyup="getPossibleCityName();" placeholder="Enter your location " ng-model="locationNameForRestaurant.locationName" style="width: 510px; height: 30px;">--> 
  <select id="selectCityId" class="sans-serif-text" style="height: 34px;width: 202px;"> 
  <option class="sans-serif-text">Select Your City</option>
  <option class="sans-serif-text">sambalpur</option>
  <option class="sans-serif-text">Cuttack</option>
    <option class="sans-serif-text">Bhubaneswar</option>
    <option class="sans-serif-text">Brahmapur</option>
    <option class="sans-serif-text">Rourkela</option>
    <option class="sans-serif-text">Brahmapur</option>
    <option class="sans-serif-text">Puri</option>
    <option class="sans-serif-text">Balasore</option>
    <option class="sans-serif-text">Bhadrak</option>
    <option class="sans-serif-text">Baripada</option>
    <option class="sans-serif-text">Jharsuguda</option>
    <option class="sans-serif-text">Angul</option>
    <option class="sans-serif-text">Jajpur</option>
    <option class="sans-serif-text">Barbil</option>
    <option class="sans-serif-text">Dhenkanal</option>
        <option class="sans-serif-text">jeypore</option>
  </select>
  
  <input type="text" style="width: 213px; height: 28px;" placeholder="Enter your location " class="sans-serif-text" >
  <input class="sans-serif-text" type="submit" value="search" style="width: 80px;height: 36px;background-color: #3c3030;color:white">
  </form>
  </div>
  
  
    </div>
</div>
 <div id="divID" class="wrap" style="margin-left: 335px">
<div  ng-repeat="location in locationArray track by $index" style="width: 350px; height: 30px;">
<div align="left" class="tab" id="tabId" ng-show="location!=null" style="width: 350px; height: 30px;" ><p id="{{'pid'+$index}}" ng-mouseover="changeCursorPointer($index);" ng-mouseleave="changeCursorNormal($index);"  ng-click="setLocationValue($index,location);">{{location.locationName}}</p></div>

</div>
 
 </div>
 
 

 
  

  
	
</div>

<!-- show restaurants -->
<div class="box box-info ScrollStyle" id="showRestaurantsId" ng-show="showRestaurantAfterSearchFlag" style="width:900px;margin-left: 200px;margin-top: 20px;opacity:0.76;position:relative">
            <div class="box-header with-border">
              <h3 class="box-title">Restaurants List</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div class="table-responsive">
                <table class="table no-margin" border="0px">
                  <thead>
                  <tr>
                    <th width="150px"></th>
                    <th width="150px">Restaurant Name</th>
                    <th width="150px">Cuisine</th>
                    <th width="150px">Location</th>
                                        <th width="150px">Ratings</th>
                                        <th width="150px">Timings</th>
                                        <th width="150px"></th>
                                        
                   
                  </tr>
                  </thead>
                  <tr>
                  <td width="150px" id="restaurantImgId" ng-click="getRestaurantPage('restaurant1');"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px"><font size="2px" id="restaurantNameId">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                  </tr>
                   <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                  <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                   <td width="150px"><font size="2px">kalinga cottage</font><br>
                                    <weak><font size="2px">Odishas own cuisine</font></weak>
                                    </td>
                                    <td width="150px"><font size="2px">South Indian,Chinese</font>
                                    <br><font size="2px">thai,North</font>
                                    </td>
                                    <td width="150px"><font size="2px">Modipara</font></td>
                                    <td width="150px">****</td>
                                    <td width="150px"><font size="2px">Within 30 mins</font></td>
                                    <td width="150px"><a href="getMap.htm"><font size="2px">Get Direction</font></a></td>
                                   
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px">kalinga cottage<br>
                                    <weak>Odishas own cuisine</weak>
                                    </td>
                                    <td width="150px">South Indian,Chinese
                                    <br>thai,North
                                    </td>
                                    <td width="150px">Modipara</td>
                                    <td width="150px">****</td>
                                    <td width="150px">Within 30 mins</td>
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px">kalinga cottage<br>
                                    <weak>Odishas own cuisine</weak>
                                    </td>
                                    <td width="150px">South Indian,Chinese
                                    <br>thai,North
                                    </td>
                                    <td width="150px">Modipara</td>
                                    <td width="150px">****</td>
                                    <td width="150px">Within 30 mins</td>
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px">kalinga cottage<br>
                                    <weak>Odishas own cuisine</weak>
                                    </td>
                                    <td width="150px">South Indian,Chinese
                                    <br>thai,North
                                    </td>
                                    <td width="150px">Modipara</td>
                                    <td width="150px">****</td>
                                    <td width="150px">Within 30 mins</td>
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px">kalinga cottage<br>
                                    <weak>Odishas own cuisine</weak>
                                    </td>
                                    <td width="150px">South Indian,Chinese
                                    <br>thai,North
                                    </td>
                                    <td width="150px">Modipara</td>
                                    <td width="150px">****</td>
                                    <td width="150px">Within 30 mins</td>
                                    
                  </tr> <tr>
                  <td width="150px"><img alt="" src="resources/images/restaurant_thumbnails/r0jr_sqp.jpg" width="78px"height="78px"> </td>
                                    <td width="150px">kalinga cottage<br>
                                    <weak>Odishas own cuisine</weak>
                                    </td>
                                    <td width="150px">South Indian,Chinese
                                    <br>thai,North
                                    </td>
                                    <td width="150px">Modipara</td>
                                    <td width="150px">****</td>
                                    <td width="150px">Within 30 mins</td>
                                    
                  </tr>
                </table>
              </div>
              <!-- /.table-responsive -->
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
               <!-- <a href="javascript:void(0)" class="btn btn-sm btn-info btn-flat pull-left">Place New Order</a>-->
              <!--  <a href="javascript:void(0)" class="btn btn-sm btn-default btn-flat pull-right">View All Orders</a>-->
            </div>
            <!-- /.box-footer -->
          </div>

<!--  -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>


<!-- Demo ads. Please ignore and remove. -->
<script src="http://cdn.tutorialzine.com/misc/enhance/v3.js" async></script>
<script type="text/javascript" src="<c:url value = "/resources/js/logincontroller.js" />"></script>
<!--  <script type="text/javascript" src="<c:url value = "/resources/js/foodcontroller.js" />"></script>-->
<!--<script type="text/javascript" src="<c:url value = "/resources/js/cuisinecontroller.js" />"></script>-->
<!--<script type="text/javascript" src="<c:url value = "/resources/js/restaurantcontroller.js" />"></script>-->
<script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<div class="footer">
<div>
<p align="center" style="size: 5px">© 2017, Gofoodiy</p>
</div>
</div>
</body>
</html>
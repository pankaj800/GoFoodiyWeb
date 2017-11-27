'use strict';

var loginApp = angular.module("loginApp", []);

loginApp.controller('loginController', function($scope,$http,$rootScope,$window) {
	$scope.cityNameForRestaurant;
	$scope.cityNameForCuisine;
	$scope.cityNameForFood;
	$scope.showRestaurantAfterSearchFlag=false;

	$scope.selectedLocation;
	$rootScope.presentLocation;

	$scope.onlineOrderDivShow=false;
	$scope.restaurantSearchDivShow=true;
	$scope.foodSearchDivShow=false;
	$scope.cuisineSearchDivShow=false;
	
  $scope.locationArray=[];
	$scope.init=function(){
		
		$.get("http://ipinfo.io", function(response) {
			$http({
				  method: 'POST',
				  data:response,
				  url: 'setLocation.htm'
				}).then(function successCallback(response) {
					$rootScope.presentLocation=response.data;
                 $window.sessionStorage.setItem("presentLocation",$rootScope.presentLocation );
                 
				    console.log($rootScope.presentLocation);
				  }, function errorCallback(response) {
				    console.log("failure");
				  });
			
		}, "jsonp");
	};
	
	$scope.init();
	
	$scope.getPossibleCityName=function(){
		 $scope.locationArray=[];
		var i;
		var cityName=angular.element(document.querySelector('#locationsearchTermId3')).val();
		console.log(cityName);
		//var myEl=angular.element( document.querySelector('#divID') );
	   
		$http({
			  method: 'POST',
			  data:cityName,
			  url: 'getCityNames.htm'
			}).then(function successCallback(response) {
				var dataFormServer=response.data;
				 $scope.locationArray=[];

				for(i=0;i<=dataFormServer.length-1;i++){
					
					$scope.locationArray.push(dataFormServer[i]);
				}
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
	};
	
	//getPossibleCityNameByFood();
	$scope.getPossibleCityNameByFood=function(){
		 $scope.locationArray=[];
		var i;
		var cityName=angular.element(document.querySelector('#locationsearchTermId1')).val();
		console.log(cityName);
		//var myEl=angular.element( document.querySelector('#divID') );
	   
		$http({
			  method: 'POST',
			  data:cityName,
			  url: 'getCityNames.htm'
			}).then(function successCallback(response) {
				var dataFormServer=response.data;
				 $scope.locationArray=[];

				for(i=0;i<=dataFormServer.length-1;i++){

					$scope.locationArray.push(dataFormServer[i]);
				}
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
	};
	//getPossibleCityNameByCuisine();
	$scope.getPossibleCityNameByCuisine=function(){
		 $scope.locationArray=[];
		var i;
		var cityName=angular.element(document.querySelector('#locationsearchTermId2')).val();
		console.log(cityName);
		//var myEl=angular.element( document.querySelector('#divID') );
	   
		$http({
			  method: 'POST',
			  data:cityName,
			  url: 'getCityNames.htm'
			}).then(function successCallback(response) {
				var dataFormServer=response.data;
				 $scope.locationArray=[];

				for(i=0;i<=dataFormServer.length-1;i++){
					
					$scope.locationArray.push(dataFormServer[i]);
				}
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
	};
	
	$scope.getRestaurantSearchForm=function(){
		$scope.cuisineSearchDivShow=false;
		$scope.restaurantSearchDivShow=true;
		$scope.foodSearchDivShow=false;		
		$scope.onlineOrderDivShow=false;

		
	};
$scope.getFoodSearchForm=function(){
	 $scope.locationArray=[];

	$scope.cuisineSearchDivShow=false;
	$scope.restaurantSearchDivShow=false;
	$scope.foodSearchDivShow=true;
	$scope.onlineOrderDivShow=false;

	};
	$scope.getCuisineSearchForm=function(){
		 $scope.locationArray=[];

		$scope.cuisineSearchDivShow=true;
		$scope.restaurantSearchDivShow=false;
		$scope.foodSearchDivShow=false;
		$scope.onlineOrderDivShow=false;

	};
	$scope.getonlineOrderDivForm=function(){
		 $scope.locationArray=[];

		$scope.onlineOrderDivShow=true;

			$scope.cuisineSearchDivShow=false;
			$scope.restaurantSearchDivShow=false;
			$scope.foodSearchDivShow=false;
	};
	
	
	$scope.sessionInvalidater=function(){
		console.log("came into sessionInvalidater" );
		$window.location.href="sessionInvalide.htm";
	};
	
	
	$scope.changeCursorPointer=function (data){
		var myEl = angular.element( document.querySelector( '#pid'+data ) );

		myEl.css("cursor","pointer");
		myEl.css("background-color","#3c3030");
		myEl.css("width","350px");
		myEl.css("height","30px");
		myEl.css("color","#ffffff");



	};
	
	$scope.changeCursorNormal=function(data){
		
		var myEl = angular.element( document.querySelector( '#pid'+data ) );
		myEl.css("background-color","#ffffff");
		myEl.css("width","350px");
		myEl.css("height","30px");
		myEl.css("color","#000000");


	};
	
	$scope.setLocationValue=function(data,location){
		
		var myEl = angular.element( document.querySelector( '#pid'+data ) );
		if($scope.cuisineSearchDivShow==false && $scope.restaurantSearchDivShow==true &&$scope.foodSearchDivShow==false){
			$scope.locationNameForRestaurant=location;

		}
		else if($scope.cuisineSearchDivShow==true && $scope.restaurantSearchDivShow==false &&	$scope.foodSearchDivShow==false){
			$scope.locationNameForCuisine=location;

		}
		
		else{
			$scope.locationNameForFood=location;
		}

		$scope.selectedLocation=location;

		  $scope.locationArray=[];

	};
	
	$scope.searchForFoodInLocation=function(){
		$scope.selectedLocation;
		
	};
	
	
$scope.searchForCuisineInLocation=function(){
	$scope.selectedLocation;
		
	};
	
$scope.searchForRestaurantInLocation=function(){
	 var locationname=$scope.selectedLocation;
	 var data=JSON.stringify(locationname);
	$http({
		  method: 'POST',
		  data:data,
		  url: 'getRestaurantByLocationName.htm'
		}).then(function successCallback(response) {
			var restaurantDataServer=response.data;
			 console.log("success");
			
			 
		  }, function errorCallback(response) {
		    console.log("failure");
		  });
	
		
	};
	
	$scope.searchForRestaurantforOrderOnline=function(){
		$scope.showRestaurantAfterSearchFlag=true;

	};
	
			$scope.getRestaurantPage=function(data){
				alert(data);
				$window.location.href="gotoRestaurantDetails.htm";
				
			};

	
});
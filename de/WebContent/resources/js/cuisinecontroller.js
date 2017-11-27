'use strict';

var loginApp = angular.module("loginApp", []);

loginApp.controller('cuisinecontroller', function($scope,$http,$rootScope,$window) {
	$scope.cityName;
	$scope.restaurantSearchDivShow=true;
	$scope.getPossibleCityName=function(){
		 $scope.cityArray=[];
		var i;
		var cityName=angular.element(document.querySelector('#citysearchTermId2')).val();
		console.log(cityName);
		//var myEl=angular.element( document.querySelector('#divID') );
	   
		$http({
			  method: 'POST',
			  data:cityName,
			  url: 'getCityNames.htm'
			}).then(function successCallback(response) {
				var dataFormServer=response.data;
				for(i=0;i<dataFormServer.length-1;i++){
					
					$scope.cityArray.push(dataFormServer[i].slice(1,dataFormServer[i].length-1));
				}
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
	};
	
	
});
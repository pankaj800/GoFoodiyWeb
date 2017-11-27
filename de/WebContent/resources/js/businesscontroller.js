'use strict';

var businessApp = angular.module("businessApp", []);
businessApp.controller('businesscontroller', function($scope,$http,$rootScope,$window) {
	$scope.detailsflag=true;
	$scope.dishesflag=false;
	$scope.menuflag=false;
	 $scope.vegFoodArray=[];
	 
	 $scope.showBeveragesFlag=false;
	 $scope.showNonVegDishesFlag=false;
	 $scope.showVegDishesFlag=false;
	 
	 $scope.showModalFlag=false;
	$scope.signin=function(){
		$window.location.href="businessdashboard.htm";
		
	};
	
	
	$scope.showDetailsForm=function(){
		$scope.detailsflag=true;
		$scope.dishesflag=false;
		$scope.menuflag=false;
		
		
	};

	$scope.showDishesForm=function(){
		$scope.detailsflag=false;
		$scope.dishesflag=true;
		$scope.menuflag=false;
		
		
	};
	$scope.showMenuForm=function(){
		$scope.detailsflag=false;
		$scope.dishesflag=false;
		$scope.menuflag=true;
		
		
	};
	
	$scope.saveAndReadOnly=function(){
		alert("going to save");
		angular.element(document.querySelector( '.detailInputElmnt' )).css('ng-readonly',true);
	};

	$scope.changeCursorPointer=function (data){
		var myEl = angular.element( document.querySelector('#'+ data ) );

		myEl.css("cursor","pointer");
	//	myEl.css("background-color","#337ab7");
		myEl.css("width","200px");
		myEl.css("height","30px");
		//myEl.css("color","#000000");



	};
	
	$scope.changeCursorNormal=function(data){
		
		var myEl = angular.element( document.querySelector( '#'+data ) );
	//	myEl.css("background-color","#dff0d8");
		myEl.css("width","200px");
		myEl.css("height","30px");
		///myEl.css("color","#337ab7");


	};
	
	
	$scope.getVegFood=function(){
		 $scope.showVegDishesFlag=true;
		 $scope.showNonVegDishesFlag=false;
			$scope.showBeveragesFlag=false;
          var i;
		$http({
			  method: 'POST',
			  data:{"locationName": "Sambalpur Road", "placeId": "ChIJXUa_rYkWIToRhcYM2dwkFPg"},
			  url: 'getRestaurantByLocationName.htm'
			}).then(function successCallback(response) {
				var restaurantDataServer=response.data;
				 console.log("success");
				 $scope.vegFoodArray=[];

					for(i=0;i<=9;i++){
						
						$scope.vegFoodArray.push(restaurantDataServer[i]);
					}
				
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
		
			
		
	};
	
	$scope.getNonVegFood=function(){
		 $scope.showVegDishesFlag=false;
		 $scope.showNonVegDishesFlag=true;
			$scope.showBeveragesFlag=false;
         var i;
		$http({
			  method: 'POST',
			  data:{"locationName": "Sambalpur Road", "placeId": "ChIJXUa_rYkWIToRhcYM2dwkFPg"},
			  url: 'getRestaurantByLocationName.htm'
			}).then(function successCallback(response) {
				var restaurantDataServer=response.data;
				 console.log("success");
				 $scope.vegFoodArray=[];

					for(i=0;i<=9;i++){
						
						$scope.vegFoodArray.push(restaurantDataServer[i]);
					}
				
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
		
			
		
	};
	
	$scope.getBeverages=function(){
		 $scope.showVegDishesFlag=false;
		 $scope.showNonVegDishesFlag=false;
			$scope.showBeveragesFlag=true;
         var i;
		$http({
			  method: 'POST',
			  data:{"locationName": "Sambalpur Road", "placeId": "ChIJXUa_rYkWIToRhcYM2dwkFPg"},
			  url: 'getRestaurantByLocationName.htm'
			}).then(function successCallback(response) {
				var restaurantDataServer=response.data;
				 console.log("success");
				 $scope.vegFoodArray=[];

					for(i=0;i<=19;i++){
						
						$scope.vegFoodArray.push(restaurantDataServer[i]);
					}
				
				 
			  }, function errorCallback(response) {
			    console.log("failure");
			  });
		
			
		
	};
	
	$scope.getFoodModal=function(){
		
		 $scope.showModalFlag=true;
		 angular.element( document.querySelector('#custom-modal-1' )).modal('show');

	};
	
	$scope.getExtras=function(){
		var ele= angular.element( document.querySelector('#jspfileid' ));

			
	};
	
	
	$scope.removeColon=function(data){
		
		return data.substring(1,data.length-1);

			
	};
	
	$scope.makeEditable=function(){

		document.getElementById("restaurantNameId").disabled = false;
		document.getElementById("restaurantTypeId").disabled = false;

		document.getElementById("restaurantStartTimingId").disabled = false;
		document.getElementById("startTimeamId").disabled = false;
		document.getElementById("startTimepmId").disabled = false;
		document.getElementById("restaurantStopTimingId").disabled = false;
		document.getElementById("stopTimeamId").disabled = false;
		document.getElementById("stopTimepmId").disabled = false;
		document.getElementById("seatCapacityId").disabled = false;
		document.getElementById("foodTypeServedId").disabled = false;
		document.getElementById("descriptionId").disabled = false;

	};
	
	$scope.saveAndReadOnly=function(){
		document.getElementById("restaurantNameId").disabled = true;
		document.getElementById("restaurantTypeId").disabled = true;

		document.getElementById("restaurantStartTimingId").disabled = true;
		document.getElementById("startTimeamId").disabled = true;
		document.getElementById("startTimepmId").disabled = true;
		document.getElementById("restaurantStopTimingId").disabled = true;
		document.getElementById("stopTimeamId").disabled = true;
		document.getElementById("stopTimepmId").disabled = true;
		document.getElementById("seatCapacityId").disabled = true;
		document.getElementById("foodTypeServedId").disabled = true;
		document.getElementById("descriptionId").disabled = true;

	};
});
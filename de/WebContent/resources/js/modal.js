'use strict';


var mymodal = angular.module('mymodal', []);

mymodal.controller('MainCtrl', function ($scope) {
	
    $scope.showModal = false;
    $scope.buttonClicked = "";
    $scope.toggleModal = function(){
        $('#viewModal').modal('show');
        keepButtonDisabled();

    };
    
    var keepButtonDisabled=function(){
    	console.log("hello");
    	$('#closeButtonId').prop("disabled",true);

    	
        setTimeout(function(){ $('#closeButtonId').prop("disabled",false); }, 5000);

    }
    
    
   
    
    
  });



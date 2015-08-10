var taskManagerModule = angular.module('productManagerApp', ['ngAnimate']);

taskManagerModule.controller('productManagerController', function ($scope,$http) {
	
	var urlBase="/admserv";
	
	$http.defaults.headers.post["Content-Type"] = "application/json";
	$scope.api="";
    
    $scope.getRestData = function getRestData(uri) {
        //get all Rest Data
    
    	    $http.get(urlBase + '/api/'+uri).
            success(function (data) {
            	
           	$scope.api=urlBase + '/api/'+uri;
             $scope.list=data;
           });
    };
});

//Angularjs Directive for confirm dialog box
taskManagerModule.directive('ngConfirmClick', [
	function(){
         return {
             link: function (scope, element, attr) {
                 var msg = attr.ngConfirmClick || "Are you sure?";
                 var clickAction = attr.confirmedClick;
                 element.bind('click',function (event) {
                     if ( window.confirm(msg) ) {
                         scope.$eval(clickAction);
                     }
                 });
             }
         };
 }]);
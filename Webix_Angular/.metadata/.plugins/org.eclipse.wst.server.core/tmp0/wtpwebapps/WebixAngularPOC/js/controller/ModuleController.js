app.controller("ModuleController",['$scope','$http','$rootScope',function($scope, $http,$rootScope){
	$scope.moduleState = 'tabs';
	
	 /*$scope.childmethod = function() {
		 console.log("in child");
         $rootScope.$emit("CallParentMethod", {});
     }*/
	$rootScope.treeClick = function(id, e, node){
		$scope.moduleState = 'project';
		console.log(id);
	}
	
}]);
var app = angular.module('webixApp', [ "webix", "ui.router" ]);

app.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise('/home');

	$stateProvider.state('home', {
		url : '/home',
		templateUrl : 'templates/partial-home.html',
	// controller: 'HomeController'
	}).state('about', {
		url : '/about',
		templateUrl : 'templates/partial-about.html',
	// controller: 'AboutController'
	}).state('project2', {
		url : '/project2',
		template : '<h1>This is the project2</h1>'
	// controller: 'AboutController'
	}).state('project4', {
		url : '/project4',
		template : '<h1>This is the project4</h1>'
	}).state('project3', {
		url : '/project3',
		template : '<h1>This is the project3</h1>'
	}).state('project5', {
		url : '/project5',
		template : '<h1>This is the project5</h1>'
	})
});

app.controller("TreeController", [
		'$scope',
		'$http',
		'$rootScope',
		function($scope, $http, $rootScope) {
			$http.get("loadTree").success(function(response) {
				console.log(response.data);
				for ( var i = 0; i < response.data.length; i++) {
					console.log(response.data[i].link);

				}
				$scope.data = response;
			});

			$scope.getChildNodes = function(id, callback, url) {
				webix.message("Getting children of " + id);
				$$('testTree').parse(
						webix.ajax().post("loadTree?parent=" + id).then(
								function(data) {
									return data = data.json();
								}));
				return false;
			}
			/*
			 * $rootScope.$on("treeClick", function(id, e, node){
			 * $rootScope.moduleState = 'project'; console.log(id); });
			 */

			$scope.treeClick = function(id, e, node) {
				$rootScope.moduleState = 'project';
				console.log(id);
			}

			/*
			 * $$('testTree').attachEvent('onItemClick', function(id, e, node){
			 * console.log(node); });
			 */
		} ]);

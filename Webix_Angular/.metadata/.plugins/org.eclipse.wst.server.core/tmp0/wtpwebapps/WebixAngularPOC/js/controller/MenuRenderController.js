app.controller("MenuRenderController", function($scope, $http) {
	$scope.records = [ {
		value : "Translate...",
		submenu : [ "English", "Slavic...", "German" ]
	}, /*{
		$template : "Separator"
	},*/ {
		value : "Post...",
		submenu : [ "Facebook", "Google+", "Twitter" ]
	} ];
});

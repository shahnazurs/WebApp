app.controller("staffsCtrl", function($scope, $http){	
	$http.get("rs/ag/projects")
		.then(function(response){
			$scope.result = response.data;
		}, function (response){
			$scope.result = "Something Wrong!!!";
		});
});

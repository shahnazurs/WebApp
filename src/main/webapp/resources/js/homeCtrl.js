app.controller("homeCtrl", function($scope){
	$scope.heading = "Home Page";
	$scope.selectedMenu = "home";
	
	$scope.setSelected=function(menu){
		$scope.selectedMenu = menu;
	};
	
	$scope.checkIfSelected = function(menu){
		if ($scope.selectedMenu == menu)
			return true;
		else
			return false;
	};
});
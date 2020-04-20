app.controller("projectsCtrl", function($scope){
$scope.selectedProjectSection = 'view';
$scope.projects = [
	                {"ln_no":"LNH2816","name" : "Pani Bhaban" },
	                {"ln_no":"LNH2816","name" : "Pani Bhaban" },
	                {"ln_no":"LNH2816","name" : "Pani Bhaban" }
	                
	 ];
$scope.countries = [
                    {"code":1, "name": "India"},
                    {"code":2, "name": "United Arab Emirates"},
                    {"code":3, "name": "United States of America"},
                    {"code":4, "name": "Malaysia"},
                    ];
	
$scope.projectAdd = function(){
	$scope.selectedProjectSection = 'add';
};

$scope.cancelProjectAdd = function(){
	$scope.selectedProjectSection = 'view';
};
	
});
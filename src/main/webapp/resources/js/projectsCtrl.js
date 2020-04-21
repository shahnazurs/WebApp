app.controller("projectsCtrl", function($scope, $http){
$scope.selectedProjectSection = 'add';
	/*$scope.projects = [
		                {"ln_no":"LNH2816","name" : "Pani Bhaban" },
		                {"ln_no":"LNH2816","name" : "Pani Bhaban" },
		                {"ln_no":"LNH2816","name" : "Pani Bhaban" }
		                
		 ];*/
	$scope.countries = [
	                    {"code":1, "name": "India"},
	                    {"code":2, "name": "United Arab Emirates"},
	                    {"code":3, "name": "United States of America"},
	                    {"code":4, "name": "Malaysia"},
	                    ];
		
	$scope.projectAdd = function(){
		$scope.selectedProjectSection = 'add';
	};
	$scope.searchedLN = "";
	$scope.openStatus=true;
	$scope.cancelProjectAdd = function(){
		$scope.selectedProjectSection = 'view';
	};

	$http.get("api/projects")
	.then(function(response){
		$scope.projects = response.data;
	}, function (response){
		$scope.projects = "Something Wrong!!!";
	});
	
	$scope.addProject=function(){

		//console.log(JSON.stringify($scope.proj.name));
		/*dataObj.em_no = $("#emno").val();
		dataObj.units = $("#units").val();
		dataObj.country_code = $("#ctry_cd").val();
		console.log(JSON.stringify(dataObj));*/
		
		
		alert("Project Added" + $scope.pname);
	};
	
	$scope.updateProject = function(){
		alert($scope.myForm.pname);
	};
	
});
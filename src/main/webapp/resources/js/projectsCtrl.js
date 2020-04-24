app.controller("projectsCtrl", function($scope, $http){
$scope.selectedProjectSection = 'view';
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
	
	$scope.projectTypes = [
						{"id": 1, "name": "New Layout"},
						{"id": 2, "name": "ARV"},
						{"id": 3, "name": "Metics"}
		
					];
	
	$scope.projects = [];
	
    _refreshProjectData();
		
	$scope.projectAdd = function(){
		$scope.projectForm = {};
		$scope.selectedProjectSection = 'add';
	};
	$scope.searchedLN = "";
	$scope.openStatus=true;
	$scope.cancelProjectAdd = function(){
		$scope.projectForm = {};
		$scope.selectedProjectSection = 'view';
	};
	//refreshProjects();
	
/*	function refreshProjects()
	{
		$http.get("api/projects")
		.then(function(response){
			$scope.projects = response.data;
		}, function (response){
			$scope.projects = "Something Wrong!!!";
		});
	}*/
	
	$scope.addProject=function(projectForm){
		console.log(projectForm);
        $http({
            method : "POST",
            url : "api/project/add",
            data : projectForm,
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then( _success, _error );
	};
	
	
	
	$scope.updateProject = function(){
		alert(this.name);
		alert($scope.myForm.pname);
	};
	
	function _refreshProjectData() {
        $http({
            method : 'GET',
            url : 'api/projects'
        }).then(function successCallback(response) {
            $scope.projects = response.data;
        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }
	
	function _success(response) {
		$scope.selectedProjectSection = 'view';
        _refreshProjectData();
        //_clearFormData()
    }

    function _error(response) {
        console.log(response.statusText);
    }
	
});
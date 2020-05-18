app.controller("projectsCtrl", function($scope, $http, $filter){
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
	
	/*$scope.projectTypes = [
						{"id": 1, "projectType": "New Layout"},
						{"id": 2, "projectType": "ARV"},
						{"id": 3, "projectType": "Metics"}
		
					];*/
	$scope.jobTypes = [];
	
	$scope.projects = [];
	function appendLeadingZero(n){
		if(n<=9)
			return "0" + n;
		else
			return n;
	}
	
	$scope.date = new Date();//$filter("date")(Date.now(), 'MM-dd-yyyy');
	todayDate = new Date();
	$scope.today = todayDate.getFullYear() + "-" + appendLeadingZero(todayDate.getMonth() + 1) + "-" + todayDate.getDate();
	
	
    _refreshProjectData();
    _refreshJobTypesData();
		
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
	//$scope.projectForm.date_received = new Date();
	 $scope.open1 = function() {
		    $scope.popup1.opened = true;
		  };
	
		  $scope.popup1 = {
				    opened: false
				  };
		  
		  $scope.formats = ['dd-MM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
		  $scope.format = $scope.formats[0];
		  $scope.altInputFormats = ['M!/d!/yyyy'];
		  
	$scope.addProject=function(projectForm){
		var sss = JSON.stringify(projectForm);
		console.log(sss);
		angular.forEach(sss, function(value, key){
			console.log("Date Received " + value.date_received);
			  /*value.startTime = new Date(value.startTime);
			  value.endTime = new Date(value.endTime);*/
			});
		console.log("Project Form 2" + JSON.stringify(projectForm));
        $http({
            method : "POST",
            url : "api/project/add",
            data : projectForm,
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then( _success, _error );
	};
	
	$scope.removeProject = function(project_id){
		$http.delete('/api/project/delete', project_id).then(function (response) {

			if (response.data)

			$scope.msg = "Data Deleted Successfully!";

			}, function (response) {

			$scope.msg = "Service not Exists";

			$scope.statusval = response.status;

			$scope.statustext = response.statusText;

			$scope.headers = response.headers();

			});
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
        	console.log(response.data);
            $scope.projects = response.data;
        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }
	
	function _refreshJobTypesData() {
        $http({
            method : 'GET',
            url : 'api/jobTypes'
        }).then(function successCallback(response) {
        	console.log(response.data);
            $scope.jobTypes = response.data;
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
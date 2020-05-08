<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html data-ng-app="myApp">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://code.angularjs.org/1.6.9/angular.min.js"></script>
<link rel="stylesheet" href="resources/css/main.css" />
<title>Home Page</title>
</head>
<body data-ng-controller="homeCtrl">
	<nav class="navbar navbar-default">
		<div class="container-fluid">

	<!-- 		<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
			</div> -->
				<ul class="nav navbar-nav">
					<li data-ng-class="{'active': checkIfSelected('home')}"><a
						href="#" data-ng-click="setSelected('home')">Home</a></li>
					<li data-ng-class="{'active': checkIfSelected('projects')}"><a
						href="#" data-ng-click="setSelected('projects')">Projects</a></li>
					<li data-ng-class="{'active': checkIfSelected('staffs')}"><a
						href="#" data-ng-click="setSelected('staffs')">Staffs</a></li>
					<li data-ng-class="{'active': checkIfSelected('admin')}"><a
						href="#" data-ng-click="setSelected('admin')">Admin</a></li>
					<li data-ng-class="{'active': checkIfSelected('about')}"><a
						href="#" data-ng-click="setSelected('about')">About</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><img src="resources/images/mitsubishi-electric.png" /></li>
				</ul>
		</div>
	</nav>
	<div class="container main">
		<div data-ng-show="selectedMenu == 'home'" class="home">
			<div class="well">Project Management System</div>
		</div>
		<div data-ng-show="selectedMenu == 'about'" class="about">
			<div data-ng-include="'resources/html/about.html'"></div>
		</div>
		<div data-ng-controller="staffsCtrl"
			data-ng-show="selectedMenu == 'staffs'" class="staffs">
			<div data-ng-include="'resources/html/staffs.html'"></div>
		</div>
		<div data-ng-controller="projectsCtrl"
			data-ng-show="selectedMenu == 'projects'" class="projects">
			<div data-ng-include="'resources/html/projects.html'"></div>
		</div>
	</div>
	<script src="resources/js/app.js"></script>
	<script src="resources/js/homeCtrl.js"></script>
	<script src="resources/js/projectsCtrl.js"></script>
	<script src="resources/js/staffsCtrl.js"></script>
</body>
<!-- <div class="footer">
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<span class="copyright"> &copy; 2020 AG MELCO Elevator Co.
					L.L.C.</span>
			</div>
			<div class="col-sm-2 col-sm-offset-6">
				<a href="#"><i class="fa fa-linkedin"></i></a> <a
					href="https://www.facebook.com/ahamed.shahnaz" target="_blank"><i
					class="fa fa-facebook"></i></a> <a href="#"><i
					class="fa fa-twitter"></i></a> <a href="#"><i
					class="fa fa-google-plus"></i></a>

			</div>
		</div>
	</div>
</div> -->
</html>
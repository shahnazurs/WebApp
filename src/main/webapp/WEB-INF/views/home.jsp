<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html data-ng-app="myApp">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/main.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Home Page</title>


</head>
<body data-ng-controller="homeCtrl">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li data-ng-class="{'active': checkIfSelected('home')}"><a href="#" data-ng-click="setSelected('home')">Home</a></li>
				<li data-ng-class="{'active': checkIfSelected('projects')}"><a href="#" data-ng-click="setSelected('projects')">Projects</a></li>
				<li data-ng-class="{'active': checkIfSelected('staffs')}"><a href="#" data-ng-click="setSelected('staffs')">Staffs</a></li>
				<li data-ng-class="{'active': checkIfSelected('admin')}"><a href="#" data-ng-click="setSelected('admin')">Admin</a></li>
				<li data-ng-class="{'active': checkIfSelected('about')}"><a href="#" data-ng-click="setSelected('about')">About</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><img src="resources/images/mitsubishi-electric.png" /></li>
			</ul>
		</div>
	</nav>
	<div class="container main">
		<div data-ng-show="selectedMenu == 'home'" class="home">
			<div class="well">
				Project Management System
			</div>
		</div>
		<div data-ng-show="selectedMenu == 'about'" class="about">
			<div data-ng-include="'resources/html/about.html'">
			</div>
		</div>
		<div data-ng-controller="staffsCtrl" data-ng-show="selectedMenu == 'staffs'" class="staffs">
			<div data-ng-include="'resources/html/staffs.html'">
			</div>
		</div>
		<div data-ng-controller="staffsCtrl" data-ng-show="selectedMenu == 'projects'" class="projects">
			<div data-ng-include="'resources/html/projects.html'">
			</div>
		</div>
	</div>
	<script src="resources/js/app.js"></script>
	<script src="resources/js/homeCtrl.js"></script>
	<script src="resources/js/projectsCtrl.js"></script>
	<script src="resources/js/staffsCtrl.js"></script>
</body>
</html>
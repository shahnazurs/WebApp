package com.shahnaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shahnaz.model.Project;
import com.shahnaz.model.ProjectType;
import com.shahnaz.service.ProjectService;
import com.shahnaz.service.ProjectTypeService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@Autowired
	ProjectTypeService projectTypeService;
	
	/* Projects Endpoints */
	
	@RequestMapping(value = "/api/projects", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@RequestMapping(value = "/api/project/add", method = RequestMethod.POST, headers = "Accept=application/json")
	public Project addCountry(@RequestBody Project project) {
		System.out.println(project);
		return projectService.addProject(project);
	}
	
	@RequestMapping(value = "/api/project/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		projectService.deleteProject(id);
 
	} 
	
	@RequestMapping(value = "/api/project/{id}", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project getCountryById(@PathVariable int id) {
		return projectService.getProject(id);
	}
	
	@RequestMapping(value = "/api/project/update", method = RequestMethod.PUT, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project updateCountry(@RequestBody Project project) {
		return projectService.updateProject(project);
 
	}
	
	/* Project Types Endpoints */
	
	@RequestMapping(value = "/api/jobTypes", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProjectType> getAllProjectTypes(){
		System.out.println(projectTypeService.getAllProjectTypes());
		return projectTypeService.getAllProjectTypes();
	}
}

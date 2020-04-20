package com.shahnaz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahnaz.model.Projects;
import com.shahnaz.repository.ProjectsRepository;


public class ProjectsService {
	
	@Autowired
	ProjectsRepository projectsRepo;
	
	public List<Projects> getAllProjects(){
		
		List<Projects> projects = new ArrayList<>();
		projectsRepo.findAll().forEach(projects::add);
		return projects;
		
	}

}

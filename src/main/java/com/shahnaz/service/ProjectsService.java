package com.shahnaz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahnaz.model.Projects;
import com.shahnaz.repository.ProjectsRepository;

@Service
public class ProjectsService {
	
	@Autowired
	ProjectsRepository projectsRepo;
	
	
	
	public ProjectsService() {
		System.out.println("---------Service Constructor-----------");
	}

	public void show(){
		System.out.println("&&&&&&&&&& Show &&&&&&&&&&&");
	}

	public List<Projects> getAllProjects(){
		System.out.println("****************^^^^^^^^^^^^^^^^^^");
		List<Projects> projects = new ArrayList<>();
		projectsRepo.findAll().toString();
		
		projectsRepo.findAll().forEach(projects::add);
		return projects;
		
	}
	
	public void createProject(Projects p)
	{
		projectsRepo.save(p);
	}

}

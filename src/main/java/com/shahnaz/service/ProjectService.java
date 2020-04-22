package com.shahnaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahnaz.model.Project;
import com.shahnaz.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectsRepo;
	
	
	public List<Project> getAllProjects(){
		return projectsRepo.findAll();
		
	}
	
	public Project addProject(Project p)
	{
		return projectsRepo.save(p);
	}
	
	public Project updateProject(Project p){
		return projectsRepo.save(p);
	}
	
	public Project getProject(int id){
		return projectsRepo.findOne(id);
	}
	
	public void deleteProject(int id){
		projectsRepo.delete(id);
	}
	

}

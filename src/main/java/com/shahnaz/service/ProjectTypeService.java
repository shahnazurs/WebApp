package com.shahnaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahnaz.model.ProjectType;
import com.shahnaz.repository.ProjectTypeRepository;

@Service
public class ProjectTypeService {
	
	@Autowired
	ProjectTypeRepository projectTypeRepository;
	
	public List<ProjectType> getAllProjectTypes(){
		return projectTypeRepository.findAll();
	}

}

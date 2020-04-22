package com.shahnaz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shahnaz.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer>{

	List<Project> findAll();
}

package com.shahnaz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shahnaz.model.Projects;

@Repository
public interface ProjectsRepository extends CrudRepository<Projects, Integer>{


}

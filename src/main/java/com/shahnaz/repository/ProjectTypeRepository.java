package com.shahnaz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shahnaz.model.ProjectType;

@Repository
public interface ProjectTypeRepository extends CrudRepository<ProjectType, Integer> {
	List<ProjectType> findAll();
}

package com.shahnaz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shahnaz.model.Countries;

public interface CountriesRepository extends CrudRepository<Countries, Integer>{
	List<Countries> findAll();
}

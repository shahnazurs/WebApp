package com.shahnaz.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.shahnaz.model.Countries;
import com.shahnaz.model.Projects;
import com.shahnaz.repository.CountriesRepository;
import com.shahnaz.service.ProjectsService;

@Path("/ag")
public class MyRestfullAPI {


	
	@Autowired
	CountriesRepository countriesRepo;
	
	@GET
	@Path("/projects")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String getProjects() {
		/*try {
			List<Countries> proj = countriesRepo.findAll();
			System.out.println(proj.get(0));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
		return "Welcome";
		
	}
}

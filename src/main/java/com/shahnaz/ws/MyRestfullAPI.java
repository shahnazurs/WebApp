package com.shahnaz.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shahnaz.model.Projects;
import com.shahnaz.repository.CountriesRepository;
import com.shahnaz.service.ProjectsService;

@Component
@Path("/ag")
public class MyRestfullAPI {

	@Autowired
	ProjectsService ps;
	
	@Autowired
	CountriesRepository countriesRepo;
	
	@GET
	@Path("/projects")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String getProjects() {
		System.out.println("-------------------");
		/*try {
			List<Projects> proj = ps.getAllProjects();
			System.out.println(proj.get(0));
		}
		catch(Exception e) {
			System.out.println("Error: Message" + e.getMessage());
		}*/
		return "Welcome";
		
	}
}

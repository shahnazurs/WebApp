package com.shahnaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shahnaz.model.Projects;
import com.shahnaz.service.ProjectsService;

@Controller
public class HomeController {
	
	@Autowired
	ProjectsService ps;
	
	public HomeController() {
		System.out.println("*********** Home Controller ***************");
	}

	@RequestMapping("/")
	public ModelAndView home(){
		//List<Projects> pp = ps.getAllProjects();
		//System.out.println(pp.get(0));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	
	@RequestMapping("/api/projects")
	@ResponseBody
	public List<Projects> getAllProjects(){
		return ps.getAllProjects();
	}
	
	/*@RequestMapping("/api/project/add")
	public void addProject(@RequestBody Projects p){
		ps.createProject(p);
	}*/

}

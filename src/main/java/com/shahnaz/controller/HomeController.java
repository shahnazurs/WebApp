package com.shahnaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	public HomeController() {
		System.out.println("*********** Home Controller ***************");
	}

	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

}

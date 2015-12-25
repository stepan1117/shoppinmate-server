package com.shoppinmate.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping(path="/")
	public ModelAndView homePage(){
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
}

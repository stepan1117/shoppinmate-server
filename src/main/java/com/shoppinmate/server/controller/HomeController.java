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
	
	@RequestMapping(path="69")
	public ModelAndView page69(){
		ModelAndView mv = new ModelAndView("69");
		return mv;
	}
	
}

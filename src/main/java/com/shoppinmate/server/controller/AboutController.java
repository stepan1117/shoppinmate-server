package com.shoppinmate.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

	@RequestMapping(path="version")
	public String about(){
		return "ShoppinMate Server version 0.1";
	}
	
}

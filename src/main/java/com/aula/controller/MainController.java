package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@RequestMapping("/")
	public String index() {
	 return "/index.html";	
	}
	
	
	// Login form
	  @RequestMapping("/login.html")
	  public String login() {
	    return "login.html";
	  }

	  // Login form with error
	  @RequestMapping("/login-error.html")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login.html";
	  }
	
	
	  
	  
	  
}

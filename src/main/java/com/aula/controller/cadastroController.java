package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroController {
	
	
	// Login form
		  @RequestMapping("/cadastropessoa.html")
		  public String login() {
		    return "cadastropessoa.html";
		  }

}

package com.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aula.model.Funcionario;
import com.aula.repository.FuncionarioRepository;




@Controller
public class cadastroController {
	
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	
	
	// Login form
		  @RequestMapping("/bbbcadastropessoa.html")
		  public String login() {
		    return "cadastropessoa.html";
		  }

		  
		  
		  @RequestMapping(method = RequestMethod.GET, value = "/cadastropessoa.html")
			public ModelAndView inicio() {
				ModelAndView modelAndView = new ModelAndView("cadastropessoa");
				modelAndView.addObject("pessoaobj", new Funcionario());
				Iterable<Funcionario> pessoasIt = funcionarioRepository.findAll();
				modelAndView.addObject("funcionarios", pessoasIt);
				return modelAndView;
			}
		  
		  
		  
		  
		  
		  
		  
		  
}

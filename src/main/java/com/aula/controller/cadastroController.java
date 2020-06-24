package com.aula.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aula.model.Funcionario;
import com.aula.repository.FuncionarioRepository;





@Controller
public class cadastroController {
	
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	

		  
		  //inicia a pagina cadastropessoa html
		  @RequestMapping(method = RequestMethod.GET, value = "/cadastropessoa.html") //link
			public ModelAndView inicio() {
				ModelAndView modelAndView = new ModelAndView("cadastropessoa"); //pagina html
				modelAndView.addObject("pessoaobj", new Funcionario()); //adiciona um objeto vasio do tipo funcionaro no form
				Iterable<Funcionario> pessoasIt = funcionarioRepository.findAll(); //adiciona todos os elementos
				modelAndView.addObject("funcionarios", pessoasIt);
				return modelAndView;
			}
		  
		  //-----------------------------------------------
		  
		  @RequestMapping(method = RequestMethod.POST, value = "**/saveFuncionario") //link action form
			public ModelAndView salvar(@Valid Funcionario funcionario, BindingResult bindingResult) {
				
				
				if (bindingResult.hasErrors()) {
					ModelAndView modelAndView = new ModelAndView("cadastropessoa");//pagina
					Iterable<Funcionario> pessoasIt = funcionarioRepository.findAll();
					modelAndView.addObject("funcionarios", pessoasIt);
					modelAndView.addObject("pessoaobj", funcionario);
					
					List<String> msg = new ArrayList<String>();
					for (ObjectError objectError : bindingResult.getAllErrors()) {
						msg.add(objectError.getDefaultMessage()); // vem das anotações @NotEmpty e outras
					}
					
					modelAndView.addObject("msg", msg);
					return modelAndView;
				}
				
				funcionarioRepository.save(funcionario);

				ModelAndView andView = new ModelAndView("cadastropessoa"); //pagina
				Iterable<Funcionario> pessoasIt = funcionarioRepository.findAll();
				andView.addObject("funcionarios", pessoasIt);
				andView.addObject("pessoaobj", new Funcionario());
					
				return andView;

			}
		  
		  //-----------------------------------------
		  
		  
		  @PostMapping("**/pesquisarpessoa")
			public ModelAndView pesquisar(@RequestParam("nomepesquisa") String nomepesquisa) {
				ModelAndView modelAndView = new ModelAndView("cadastropessoa"); //pagina
				modelAndView.addObject("funcionarios", funcionarioRepository.findFuncionarioByName(nomepesquisa));
				modelAndView.addObject("pessoaobj", new Funcionario());
				return modelAndView;
			}
		  
		  
		//-------------------------------------------------------  
		  
		  
		  @RequestMapping(method = RequestMethod.GET, value = "/listafuncionarios")
			public ModelAndView pessoas() {
				ModelAndView andView = new ModelAndView("cadastropessoa");
				Iterable<Funcionario> pessoasIt = funcionarioRepository.findAll();
				andView.addObject("funcionarios", pessoasIt);
				andView.addObject("pessoaobj", new Funcionario());
				return andView;
			}
		  
		  
		//------------------------------------------------------------------------------  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}

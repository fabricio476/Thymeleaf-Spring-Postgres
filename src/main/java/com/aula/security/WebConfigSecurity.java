package com.aula.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebConfigSecurity extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	        .formLogin()
	        .loginPage("/login.html")
	        .failureUrl("/login-error.html")
	      .and()
	        .logout()
	        .logoutSuccessUrl("/index.html");
	}
	
	
	
	
	
	
}

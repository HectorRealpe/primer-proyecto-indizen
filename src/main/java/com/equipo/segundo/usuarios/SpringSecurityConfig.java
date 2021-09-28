package com.equipo.segundo.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
        auth.inMemoryAuthentication()
	        .withUser("admin")
	        	.password("{noop}pass")
	        		.roles("ADMIN", "USER")
	        	.and()
	            .withUser("alejandro")
		        	.password("{noop}pass")
		        		.roles("USER")
		        .and()
		        .withUser("javier")
		        	.password("{noop}pass")
		        		.roles("USER")
		        .and()
		        .withUser("hector")
		        	.password("{noop}pass")
		        		.roles("USER");
        
	}
    
//    protected void configure(HttpSecurity http) {
//    	http.authorizeRequests()
//    		.antMatchers(null)
//    }
	
}
package com.equipo.segundo.usuarios;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.equipo.segundo.usuarios.auth.LoginSuccessHandler;


@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private LoginSuccessHandler successHandler;
	
//	@Autowired 
//	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/", "/css/**", "/js/**", "/images/**", "/listar","/formulario").permitAll()
		.antMatchers("/listar/**").hasAnyRole("USER")
		.antMatchers("/index/**").hasAnyRole("USER")
		.antMatchers("/anadirAdmin/**").hasAnyRole("ADMIN")
		.antMatchers("/actualizarAdmin/**").hasAnyRole("ADMIN")
		.antMatchers("/listarAdmin/**").hasAnyRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		    .formLogin().successHandler(successHandler)
		    .loginPage("/login").permitAll()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/error_403");

	}

	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
		
		PasswordEncoder encoder = passwordEncoder;
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		
		build.inMemoryAuthentication()
		.withUser(users.username("admin").password("12345").roles("ADMIN", "USER"))
		.withUser(users.username("hector").password("12345").roles("USER"))
		.withUser(users.username("javier").password("12345").roles("USER"))
		.withUser(users.username("alejandro").password("12345").roles("USER"));
	}
}

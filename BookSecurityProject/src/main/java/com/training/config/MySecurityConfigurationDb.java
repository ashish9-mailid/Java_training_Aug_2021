package com.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.training.services.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class MySecurityConfigurationDb extends WebSecurityConfigurerAdapter {
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	/*
	 * does not work for mysql
	 * 
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 */
	  @Bean 
	  public PasswordEncoder passwordEncoder() { 
		  
		  return new PasswordEncoder()
		  {
	  
			  @Override 
			  public String encode(CharSequence charSequence) { 
				  return charSequence.toString(); }
	  
			  @Override 
			  public boolean matches(CharSequence charSequence, String s) {
				  if(charSequence.equals(s))	
				  return true; 
				  return false;
				  	
			  } }; }
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());
			
		
	}
	
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
	      httpSecurity
		  .authorizeRequests() 
		  .antMatchers("/user/**")
		  //.hasRole("USER")
		  .hasAnyRole("USER","ADMIN")
		  .and()
		  .authorizeRequests()
		  .antMatchers("/admin/**")
		  .hasRole("ADMIN")
		  .anyRequest()
		  .authenticated()
		  .and()
		  .formLogin();
		 
	}
	

}

package com.spring.basic.security.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception{
		builder.inMemoryAuthentication().withUser("jeelan").password("me").roles("admin");
	}
	
	/*
	 * @Override public void configure(HttpSecurity http) throws Exception{
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
	}
	
	@Bean
	public NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}

package com.anilemrah.dolap.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.anilemrah.dolap.service.UserService;

/**
 * This part need to be improved to make this application more secure, but for
 * now it will stays like this
 * 
 * @author Anil Emrah
 *
 */
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final UserService userService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public WebSecurityConfiguration(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userService = userService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/*/*").permitAll().anyRequest().authenticated();
	}

	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
	}
}
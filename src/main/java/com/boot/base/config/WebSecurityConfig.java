package com.boot.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("admin").password("123456").roles("ADMIN").build());
		return manager;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(http);
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/oauth/*").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
//				.loginPage("/login")
				.permitAll();
	}

	
}

package com.vyntra.vyntrau.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class AppSec extends WebSecurityConfigurerAdapter{
	
/*	
	  @Override
	  public void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication()
	        .withUser("user").password("user").roles("USER")
	        .and()
	    	.withUser("admin").password("admin").roles("ADMIN");
	  }
*/
	  @Bean
	  public PasswordEncoder passenc() {
		  return NoOpPasswordEncoder.getInstance();
	  }
	

    @Autowired
    //private VyntraUserDetailsService userDetailsService;
    private VyntraUserDetailsService userDetailsService;

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        //provider.setPasswordEncoder(new BCryptPasswordEncoder(11));
        provider.setPasswordEncoder(passenc());  
        provider.setAuthoritiesMapper(authoritiesMapper());
        return provider;
    }

    public GrantedAuthoritiesMapper authoritiesMapper() {
        SimpleAuthorityMapper authorityMapper = new SimpleAuthorityMapper();
        authorityMapper.setConvertToUpperCase(true);
        authorityMapper.setDefaultAuthority("USER");
        return authorityMapper;
    }

	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }


	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable().headers().frameOptions().disable().and().authorizeRequests()
		.antMatchers("/addpro","/listpro").hasRole("ADMIN")
		.antMatchers("/vyntra").hasAnyRole("USER","ADMIN")
		.antMatchers("/","/reg","/login").permitAll()
        .anyRequest().authenticated() // 7
        .and()
        .formLogin();
	}
}

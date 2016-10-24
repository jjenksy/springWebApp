package com.logicode.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jjenkins on 10/24/2016.
 * @EnableWebSecurity turns
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * THis method is overidden so spring security will stop ignoring my resources
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**" )
                .antMatchers("/static/**")
                .antMatchers("/style/**")
                .antMatchers("/js/**");
    }

    //configure(HttpSecurity) method defines which URL paths should be secured and which should not.
    //Specifically, the "/" and "/index" paths are configured to not require any authentication
    // All other paths must be authenticated.
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //When a user successfully logs in, they will be redirected
        // to the previously requested page that required authentication.
        // There is a custom "/login" page specified by loginPage(),
        // and everyone is allowed to view it.
        http.authorizeRequests()
                .antMatchers("/", "/index").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();

        //disable the security error
        http.csrf().disable();


    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        ldapAuthentication() method configures things where the username at the login
// form is plugged into {0} such that it searches uid={0},ou=people,dc=springframework,
// dc=org in the LDAP server
        auth.ldapAuthentication()
                .userDnPatterns("uid={0},ou=people")
                .groupSearchBase("ou=groups")
                .contextSource().ldif("classpath:test-server.ldif");
    }



}


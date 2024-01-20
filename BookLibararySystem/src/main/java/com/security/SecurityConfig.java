//package com.security;
//
//import java.beans.JavaBean;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//
//@Configuration
//@EnableWebSecurity
//@JavaBean
//public class SecurityConfig extends WebSecurityConfiguration {
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .csrf().disable() // Disable CSRF
//            .cors()            // Enable CORS
//            .and()
//            .authorizeRequests()
//                .requestMatchers("/public/**").permitAll() // Allow requests to "/public/**" without authentication
//                .anyRequest().authenticated()
//            .and()
//            .httpBasic(); // Use HTTP Basic Authentication
//    }
//}

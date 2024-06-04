package com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig  {

	
	
	@Bean
	 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(c->c.disable()) // Disable CSRF
            .cors(c->c.disable())            // Enable CORS
            
            .authorizeHttpRequests(auth->auth
                 // Allow requests to "/public/**" without authentication
                .anyRequest().authenticated())
            
            .httpBasic(b->b.realmName("noor")); // Use HTTP Basic Authentication
        
        return http.build();
    }
}

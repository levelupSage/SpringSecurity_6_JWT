package com.levelup360.OTTProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfigs {

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails userDetails = User.withUsername("admin").password("{noop}Admin@123").build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}

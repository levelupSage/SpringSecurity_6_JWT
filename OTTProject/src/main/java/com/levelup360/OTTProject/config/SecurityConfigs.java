package com.levelup360.OTTProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigs {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(req ->
                req.requestMatchers("/dashboard").authenticated()
                        .anyRequest().permitAll());

        httpSecurity.formLogin(Customizer.withDefaults()).oneTimeTokenLogin(Customizer.withDefaults());

        return httpSecurity.build();
    }


    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails userDetails = User.withUsername("admin").password("{noop}Admin@123").build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}

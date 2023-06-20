package com.carpooling.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AdminConfiguration {
    @Bean
    public UserDetailsService userDetailsService() {
        return new AdminServiceConfig();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        UserDetailsService userDetailsService = new AdminServiceConfig();
        authProvider.setUserDetailsService(userDetailsService);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        authProvider.setPasswordEncoder(passwordEncoder);
        return authProvider;
    }

    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

       // auth.authenticationProvider(authProvider());
    }

    @Bean

    protected void configure(HttpSecurity http) throws Exception {

       /* http

                .authorizeRequests()

        ;*/
        //a remplir cette fonction
    }
}
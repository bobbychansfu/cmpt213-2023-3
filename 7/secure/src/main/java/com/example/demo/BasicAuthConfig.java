package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BasicAuthConfig {

    private final RestAuthenticationError authenticationError;

    public BasicAuthConfig(RestAuthenticationError authenticationError) {
        this.authenticationError = authenticationError;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(expressionInterceptUrlRegistry ->
                expressionInterceptUrlRegistry.requestMatchers("/public/**")
                        .permitAll()
                        .anyRequest()
                        .authenticated())
             .httpBasic(httpSecurityHttpBasicConfigurer ->
                        httpSecurityHttpBasicConfigurer.authenticationEntryPoint(authenticationError));

        return http.build();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth,PasswordEncoder passwordEncoder) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(PasswordEncoderConfig.passwordEncoder())
                .withUser("bobbyc")
                .password(PasswordEncoderConfig.passwordEncoder().encode("password"))
                .roles("ADMIN");
    }

}

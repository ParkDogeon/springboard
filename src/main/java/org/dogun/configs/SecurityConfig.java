package org.dogun.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){

        return web -> web.ignoring().requestMatchers("/css/**","/js/**","/images/**", "/errors/**");
    }

}

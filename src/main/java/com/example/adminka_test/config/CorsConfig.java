package com.example.adminka_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Разрешить запросы с любого источника
        config.addAllowedMethod("*"); // Разрешить все методы (GET, POST, PUT, DELETE и т.д.)
        config.addAllowedHeader("*"); // Разрешить все заголовки
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}


package br.com.possoler.api.api_posso_ler.api.interceptors.auth_token.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class EndpointsConfig {

    @Autowired
    private Environment environment;

    @Bean
    public List<String> getEndpointsFromEnviroment() {
        List<String> endpoints = new ArrayList<>();
        endpoints.add("/middleware/teste");
        return endpoints;
    }
}

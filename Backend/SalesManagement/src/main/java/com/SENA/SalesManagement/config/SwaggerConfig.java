package com.SENA.SalesManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sales Management API")
                        .version("1.0")
                        .description("API for Sales Management System")
                        .contact(new Contact()
                                .name("Sales Management Team")
                                .email("support@salesmanagement.com")));
    }
}
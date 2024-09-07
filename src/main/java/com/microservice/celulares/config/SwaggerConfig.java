package com.microservice.celulares.config;

import java.util.Collections;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.microservice.celulares.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Celulares",
                "Servicio para venta de celulares",
                "1.0.0",
                "Términos de servicio",
                new Contact("Rocha", "https://www.google.com.mx/?hl=es", "edson.rochargz@uanl.edu.mx"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}

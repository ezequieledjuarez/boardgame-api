package com.boargame.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@EnableWebMvc
public class SwaggerConfig {

	@Bean
	OpenAPI boardGameApi() {
		return new OpenAPI()
				.info(new Info().title("Boardgame Api").description("Api to request boardgames published in BBG")
						.version("1.0.0").license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation().description("Boardgame Wiki").url("agegarDocumentacion"));

	}

}

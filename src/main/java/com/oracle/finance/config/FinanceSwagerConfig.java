/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.oracle.finance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author sreenu,09-Mar-2022 Description :
 */
@Configuration
public class FinanceSwagerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new ApiInfoBuilder()
				.description("Finance Service API").title("Finance Service API").version("1.0.0")
				.build())
				.enable(true).select()
				.apis(RequestHandlerSelectors.basePackage("com.oracle.finance.controller"))
				.paths(PathSelectors.any()).build();

	}

}

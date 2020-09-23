package com.marketPlace.portal.config;

import marketPlace.commons.config.BaseSwaggerConfig;
import marketPlace.commons.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.portal.controller")
                .title("Market Place front desk system ")
                .description("Market Place front-end related interface documents")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
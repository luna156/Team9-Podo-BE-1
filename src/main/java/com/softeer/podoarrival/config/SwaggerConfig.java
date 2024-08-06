package com.softeer.podoarrival.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://localhost:8081/swagger-ui/index.html
@Configuration
public class SwaggerConfig {

    private final String TITLE = "Softeer-arrival";
    private final String DESCRIPTION = "못말리는 현기차 arrival-server swagger";
    private final String VERSION = "V1.0.0";

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title(TITLE)
                        .description(DESCRIPTION)
                        .version(VERSION)
                );
    }


}
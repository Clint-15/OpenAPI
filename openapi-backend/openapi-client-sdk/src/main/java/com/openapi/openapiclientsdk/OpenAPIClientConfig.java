package com.openapi.openapiclientsdk;

import com.openapi.openapiclientsdk.client.openapiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("openapi.client")
@Data
@ComponentScan
public class OpenAPIClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public openapiClient openapiClient() {
        return new openapiClient(accessKey, secretKey);
    }

}

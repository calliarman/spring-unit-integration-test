package com.mgiglione;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAsync
public class MangaApplication {

    @Bean
    protected RestTemplate getTemplate() {
        return new RestTemplate();
    }
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(MangaApplication.class).run(args);
    }

}

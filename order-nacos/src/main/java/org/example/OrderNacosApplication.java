package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderNacosApplication {
    public static void main(String[] args) {
        System.out.println("Application start!");
        SpringApplication.run(OrderNacosApplication.class, args);
    }

//    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restBuilder){
        RestTemplate template = restBuilder.build();
        return template;
    }
}
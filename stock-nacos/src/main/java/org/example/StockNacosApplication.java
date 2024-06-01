package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockNacosApplication {
    public static void main(String[] args) {
        System.out.println("Application start!");
        SpringApplication.run(StockNacosApplication.class, args);
    }
}
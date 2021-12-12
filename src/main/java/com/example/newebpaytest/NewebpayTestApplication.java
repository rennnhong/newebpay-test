package com.example.newebpaytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NewebpayTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewebpayTestApplication.class, args);
    }

}

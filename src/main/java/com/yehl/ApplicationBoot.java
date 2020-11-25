package com.yehl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class ApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }
}

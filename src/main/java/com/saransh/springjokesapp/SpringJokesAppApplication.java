package com.saransh.springjokesapp;

import com.saransh.springjokesapp.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SpringConfig.class)
public class SpringJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJokesAppApplication.class, args);
    }

}

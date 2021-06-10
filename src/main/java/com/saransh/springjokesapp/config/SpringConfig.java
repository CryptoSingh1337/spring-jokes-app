package com.saransh.springjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by CryptoSingh1337 on 6/10/2021
 */
@Configuration
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public ChuckNorrisQuotes getChuckNorrisQuoteBean() {
        return new ChuckNorrisQuotes();
    }
}

package com.diegobiazin.cursomc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("prod")
public class ProdConfig {

    @Bean
    public boolean instantiateDataBase() throws ParseException {
        return true;
    }
}

package com.SpringCore.ref;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public B getb() {
        return new B(60);
    }
}

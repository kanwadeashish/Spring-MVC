package com.xworkz.reader.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ReaderDetails {

    public ReaderDetails(){
        System.out.println("Reader Details...");
    }

    @Bean
    public String className(){
        System.out.println("ReaderDetails");
        return new String();
    }
}

package com.xworkz.writer.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WriterDetails {

    public WriterDetails(){
        System.out.println("Writer Details....");
    }

    @Bean
    public String className(){
        System.out.println("WriterDetails");
        return null;
    }

}

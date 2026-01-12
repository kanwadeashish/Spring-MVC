package com.xworkz.writer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.writer")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("WebConfiguration....");
    }

}

package com.xworkz.reader.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.reader")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("WebConfiguration....");
    }

}

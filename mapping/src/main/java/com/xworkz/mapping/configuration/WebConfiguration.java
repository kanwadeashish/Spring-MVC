package com.xworkz.mapping.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mapping")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("Web Configuration.....");
    }

}

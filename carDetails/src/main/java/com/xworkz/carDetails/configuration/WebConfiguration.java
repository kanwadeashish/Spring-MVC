package com.xworkz.carDetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.caeDetails.com")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("Web Configuration");
    }

}

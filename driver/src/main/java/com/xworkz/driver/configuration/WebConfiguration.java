package com.xworkz.driver.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.driver")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("WebConfiguration....");
    }

}

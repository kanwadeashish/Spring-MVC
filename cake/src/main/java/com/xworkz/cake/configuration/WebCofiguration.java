package com.xworkz.cake.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.cake")
public class WebCofiguration {
    public WebCofiguration(){
        System.out.println("this is web configuration");
    }
}

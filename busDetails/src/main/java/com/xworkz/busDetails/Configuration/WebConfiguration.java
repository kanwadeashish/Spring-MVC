package com.xworkz.busDetails.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.busDetails.com")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("Web Configuration");
    }

}

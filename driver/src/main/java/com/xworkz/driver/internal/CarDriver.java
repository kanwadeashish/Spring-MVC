package com.xworkz.driver.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CarDriver {

    public CarDriver(){
        System.out.println("Car Driver.....");
    }

    @Bean
    public String className(){
        System.out.println("CarDriver");
        return null;
    }

}

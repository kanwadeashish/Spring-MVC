package com.xworkz.bikeDetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bikeDetails")
public class BikeConfiguration {

    public BikeConfiguration(){
        System.out.println("Bike Configuration...");
    }

}

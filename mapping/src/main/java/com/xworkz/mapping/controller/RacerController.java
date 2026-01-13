package com.xworkz.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RacerController {

    public RacerController(){
        System.out.println("RacerController....");
    }

    @GetMapping("/racerDetails")
    public String racerDetails(){
        System.out.println("Racer Details Controller");
        return "racer.jsp";
    }

}

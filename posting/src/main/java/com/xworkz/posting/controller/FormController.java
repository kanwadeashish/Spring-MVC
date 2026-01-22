package com.xworkz.posting.controller;

import com.xworkz.posting.dto.FormDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FormController {

    public FormController(){
        System.out.println("FormController....");
    }

    @PostMapping("/formDetails")
    public String formDetails(FormDto dto){
        System.out.println("Id : "+dto.getId());
        System.out.println("Name : "+dto.getName());
        System.out.println("Username : "+dto.getUsername());
        System.out.println("Email : "+dto.getEmail());
        System.out.println("Phone Number : "+dto.getPhoneNumber());
        System.out.println("Percentage : "+dto.getPercentage());
        System.out.println("Is Passed : "+dto.isPassed());
        return "response";
    }

}

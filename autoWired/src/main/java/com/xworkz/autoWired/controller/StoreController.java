package com.xworkz.autoWired.controller;

import com.xworkz.autoWired.dto.StoreDto;
import com.xworkz.autoWired.service.StoreImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StoreController {

    @Autowired
    StoreDto dto;

    @Autowired
    StoreImpl impl;

    public StoreController(){
        System.out.println("StoreController....");
    }

    @GetMapping("/storeDetails")
    public String storeDetails(@RequestParam String name){
        impl.storeDetails();
        System.out.println("storeDetails controller method....");
        System.out.println("The store name submitted :"+name);
        return "storeResponse.jsp";
    }

}

package com.xworkz.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StoreController {

    public StoreController(){
        System.out.println("Store Mapping.");
    }

    @GetMapping("/storeDetails")
    public String storeDetails(){
        System.out.println("Store details Controller Method");
        return "store.jsp";
    }


}

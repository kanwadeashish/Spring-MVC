package com.xworkz.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ReaderController {

    public ReaderController(){
        System.out.println("ReaderController....");
    }

    @GetMapping("/readerDetails")
    public String readerDetails(){
        System.out.println("Reader details controller method.");
        return "reader.jsp";
    }

}

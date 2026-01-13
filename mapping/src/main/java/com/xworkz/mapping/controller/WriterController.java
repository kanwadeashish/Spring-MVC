package com.xworkz.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WriterController {

    public WriterController(){
        System.out.println("Writer Controller....");
    }

    @GetMapping("/writerDetails")
    public String writerDetails(){
        System.out.println("Writer Details controller method.");
        return "writer.jsp";
    }

}

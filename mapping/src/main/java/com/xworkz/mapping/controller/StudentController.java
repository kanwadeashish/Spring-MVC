package com.xworkz.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    public StudentController(){
        System.out.println("StudentController....");
    }

    @GetMapping("/studentDetails")
    public String studentDetails(){
        System.out.println("Student Details Controller Method.");
        return "student.jsp";
    }

}

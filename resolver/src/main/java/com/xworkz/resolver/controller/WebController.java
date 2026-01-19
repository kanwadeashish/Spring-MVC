package com.xworkz.resolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class WebController {

    public WebController(){
        System.out.println("WebController....");
    }

    @GetMapping("/mangoDetails")
    public String mangoDetails(@RequestParam int price){
        System.out.println("mangoDetails controller method....");
        System.out.println("Mango price :"+price);
        return "mangoResponse";
    }

    @GetMapping("/berryDetails")
    public String berryDetails(@RequestParam int price){
        System.out.println("berryDetails controller method....");
        System.out.println("Berry price :"+price);
        return "berryResponse";
    }

    @GetMapping("/appleDetails")
    public String appleDetails(@RequestParam int price){
        System.out.println("appleDetails controller method....");
        System.out.println("Apple price :"+price);
        return "appleResponse";
    }

    @GetMapping("/bananaDetails")
    public String bananaDetails(@RequestParam int price){
        System.out.println("bananaDetails controller method....");
        System.out.println("Banana price :"+price);
        return "bananaResponse";
    }

    @GetMapping("/lemonDetails")
    public String lemonDetails(@RequestParam int price){
        System.out.println("lemonDetails controller method....");
        System.out.println("Lemon price :"+price);
        return "lemonResponse";
    }

    @GetMapping("/orangeDetails")
    public String orangeDetails(@RequestParam int price){
        System.out.println("orangeDetails controller method....");
        System.out.println("Orange price :"+price);
        return "orangeResponse";
    }

    @GetMapping("/plumDetails")
    public String plumDetails(@RequestParam int price){
        System.out.println("plumDetails controller method....");
        System.out.println("Plum price :"+price);
        return "plumResponse";
    }

    @GetMapping("/kiwiDetails")
    public String kiwiDetails(@RequestParam int price){
        System.out.println("kiwiDetails controller method....");
        System.out.println("Kiwi price :"+price);
        return "kiwiResponse";
    }

    @GetMapping("/dateDetails")
    public String dateDetails(@RequestParam int price){
        System.out.println("dateDetails controller method....");
        System.out.println("Date price :"+price);
        return "dateResponse";
    }

    @GetMapping("/melonDetails")
    public String melonDetails(@RequestParam int price){
        System.out.println("melonDetails controller method....");
        System.out.println("Melon price :"+price);
        return "melonResponse";
    }

}

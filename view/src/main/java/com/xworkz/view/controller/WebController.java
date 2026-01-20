package com.xworkz.view.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class WebController {

    public WebController(){
        System.out.println("WebController....");
    }

    @GetMapping("/storeDetails")
    public String storeDetails(@RequestParam String name){
        System.out.println("storeDetails controller method....");
        System.out.println("Store Name :"+name);
        return "storeResponse";
    }

    @GetMapping("/teaDetails")
    public String teaDetails(@RequestParam int price){
        System.out.println("teaDetails controller method....");
        System.out.println("tea Price :"+price);
        return "teaResponse";
    }

    @GetMapping("/coffeeDetails")
    public String coffeeDetails(@RequestParam int price){
        System.out.println("coffeeDetails controller method....");
        System.out.println("coffee Price :"+price);
        return "coffeeResponse";
    }

    @GetMapping("/shirtDetails")
    public String shirtDetails(@RequestParam int price){
        System.out.println("shirtDetails controller method....");
        System.out.println("shirt price :"+price);
        return "shirtResponse";
    }

    @GetMapping("/pantDetails")
    public String pantDetails(@RequestParam int price){
        System.out.println("pantDetails controller method....");
        System.out.println("pant price :"+price);
        return "pantResponse";
    }

    @GetMapping("/colaDetails")
    public String colaDetails(@RequestParam int price){
        System.out.println("colaDetails controller method....");
        System.out.println("cola price :"+price);
        return "colaResponse";
    }

    @GetMapping("/mazzaDetails")
    public String mazzaDetails(@RequestParam int price){
        System.out.println("mazzaDetails controller method....");
        System.out.println("mazza price :"+price);
        return "mazzaResponse";
    }

    @GetMapping("/limkaDetails")
    public String limkaDetails(@RequestParam int price){
        System.out.println("limkaDetails controller method....");
        System.out.println("limka price :"+price);
        return "limkaResponse";
    }

    @GetMapping("/sodaDetails")
    public String sodaDetails(@RequestParam int price){
        System.out.println("sodaDetails controller method....");
        System.out.println("soda price :"+price);
        return "sodaResponse";
    }

    @GetMapping("/cokeDetails")
    public String cokeDetails(@RequestParam int price){
        System.out.println("cokeDetails controller method....");
        System.out.println("coke price :"+price);
        return "cokeResponse";
    }

}

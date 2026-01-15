package com.xworkz.viewResolver.controller;

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

    @GetMapping("/roseDetails")
    public String roseDetails(@RequestParam int price){
        System.out.println("roseDetails controller method....");
        System.out.println("rose price :"+price);
        return "roseResponse";
    }

    @GetMapping("/daisyDetails")
    public String daisyDetails(@RequestParam int price){
        System.out.println("daisyDetails controller method....");
        System.out.println("daisy price :"+price);
        return "daisyResponse";
    }

    @GetMapping("/lilyDetails")
    public String lilyDetails(@RequestParam int price){
        System.out.println("lilyDetails controller method....");
        System.out.println("lily price :"+price);
        return "lilyResponse";
    }

    @GetMapping("/tulipDetails")
    public String tulipDetails(@RequestParam int price){
        System.out.println("tulipDetails controller method....");
        System.out.println("tulip price :"+price);
        return "tulipResponse";
    }

    @GetMapping("/irisDetails")
    public String irisDetails(@RequestParam int price){
        System.out.println("irisDetails controller method....");
        System.out.println("iris price :"+price);
        return "irisResponse";
    }

    @GetMapping("/orchidDetails")
    public String orchidDetails(@RequestParam int price){
        System.out.println("orchidDetails controller method....");
        System.out.println("orchid price :"+price);
        return "orchidResponse";
    }

    @GetMapping("/poppyDetails")
    public String poppyDetails(@RequestParam int price){
        System.out.println("poppyDetails controller method....");
        System.out.println("poppy price :"+price);
        return "poppyResponse";
    }

    @GetMapping("/lotusDetails")
    public String lotusDetails(@RequestParam int price){
        System.out.println("lotusDetails controller method....");
        System.out.println("lotus price :"+price);
        return "lotusResponse";
    }

    @GetMapping("/pansyDetails")
    public String pansyDetails(@RequestParam int price){
        System.out.println("pansyDetails controller method....");
        System.out.println("pansy price :"+price);
        return "pansyResponse";
    }

    @GetMapping("/dahliaDetails")
    public String dahliaDetails(@RequestParam int price){
        System.out.println("dahliaDetails controller method....");
        System.out.println("dahlia price :"+price);
        return "dahliaResponse";
    }

}

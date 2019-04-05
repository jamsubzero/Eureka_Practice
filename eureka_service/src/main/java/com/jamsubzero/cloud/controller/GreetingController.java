package com.jamsubzero.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting(){
        return "Hello from" ;
    }
    
    @GetMapping("/hi")
    public String hiGreeting(){
        return "Hi bordx" ;
    }
    
    


}
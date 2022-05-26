package com.example.fos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello world";
    }
}

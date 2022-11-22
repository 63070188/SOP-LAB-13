package com.example.bookservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recommended")
public class BookServiceController {

    @GetMapping
    public String getBook(){
        return "spring in Action (Manning), Cloud Native Java";
    }
}

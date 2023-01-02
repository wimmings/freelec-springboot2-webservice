package com.example.freelecspringboot2webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

//    @GetMapping("/hello/dto")
//    public HelloResponseDto helloDto(@RequestParam("_name") String name,
//                                     @RequestParam("_amount") int amount) {
//
//        return new HelloResponseDto(name, amount);
//    }

}

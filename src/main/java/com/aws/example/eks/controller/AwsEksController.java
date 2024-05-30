package com.aws.example.eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsEksController {

    @GetMapping("/helloworld")
    public String greetings(){
        return "HelloWorld - Welcome to AWS - EKS";
    }
}

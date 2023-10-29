package com.springcheck.riyazapp.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiyazRestController {

    @GetMapping("/")
    public String greetHello()
    {
        return "Hey Riyaz Congrats this is a new api developed by you" ;
    }

    @GetMapping("/riyaz-family")
    public String riyazFam(){return "There are 12 family members";}




}

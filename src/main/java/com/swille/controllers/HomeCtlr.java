package com.swille.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCtlr {

    @RequestMapping({"/", "/home"})
    public String home() {
        System.out.println((char) 27 + "[30;43m" + "home" +(char) 27 + "[0m");
        return "{name:\"kick ass!\"}";
    }
}


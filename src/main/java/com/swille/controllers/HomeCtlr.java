package com.swille.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCtlr {

    @RequestMapping({"/","/home"})
    public String home(){return "kick ass!"; };
}


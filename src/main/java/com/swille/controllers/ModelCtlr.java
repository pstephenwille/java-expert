package com.swille.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api"})
public class ModelCtlr {


    @RequestMapping(value="/get", method=RequestMethod.GET)
    public String getChannelPosts()
    {
        /*
        * returns object from repo */
        System.out.println("\033[30;47m" +"my get");
        return "my get!";
    }
}

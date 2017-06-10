package com.swille.controllers;

import com.swille.domain.repository.RecalledVehicles;
import com.swille.domain.services.RecallService;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping({"/api"})
public class ModelCtlr {


    private RecallService service = new RecallService();

    @RequestMapping(value="/recalls", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RecalledVehicles getRecalls() throws IOException
    {
        /*
        * returns object from repo */
        System.out.println("\033[30;47m" +"my get");
        return service.getRecalls();
    }

    @RequestMapping(value="/entity", method=RequestMethod.GET)
    public ResponseEntity<String> test()
    {
        /*
        * returns object from repo */
        System.out.println("\033[30;47m" +"my get");
        return service.getRecallsEntity();
    }
}

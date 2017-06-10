package com.swille.domain.services;


import com.swille.domain.repository.RecalledVehicles;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/*
* domain service
* handles business logic
* applies business logic to build domain entities */
@Service
public class RecallService {

    private RestTemplate template = new RestTemplate();
    private String recalledVehiclesURL = "https://one.nhtsa.gov/webapi/api/Recalls/vehicle/modelyear/2000/make/saturn?format=json";


    /* no worky; returns null fields */
    public RecalledVehicles getRecalls() throws RestClientException {
        /* get data, perform business logic, return built domain object. */
        try {
            /* todo: recalledVehiclesURL returns text/plain;  need to convert to json */
            return template.getForObject(recalledVehiclesURL, RecalledVehicles.class);
        } catch (RestClientException ex) {
            System.out.println("\033[30;47m" + ex);
            return null;
        }
    }

    /* works */
    public ResponseEntity<String> getRecallsEntity() {
        /* get data, perform business logic, return built domain object. */
        return template.getForEntity(recalledVehiclesURL, String.class);
    }

}

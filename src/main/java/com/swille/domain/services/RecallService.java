package com.swille.domain.services;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swille.domain.repository.RecalledVehicles;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/*
* domain service
* handles business logic
* applies business logic to build domain entities */
@Service
public class RecallService {

    private RestTemplate template = new RestTemplate();
    private String recalledVehiclesURL = "https://one.nhtsa"
                                         + ".gov/webapi/api/Recalls/vehicle/modelyear/2000/make/saturn?format=json";


    /* no worky; returns null fields */
    public RecalledVehicles getRecalls() throws RestClientException, IOException {
        /* get data, perform business logic, return built domain object. */
        String jsonString;
        try {
            /* todo: recalledVehiclesURL returns text/plain;  need to convert to json */
            jsonString = template.getForEntity(recalledVehiclesURL, String.class).getBody();
        } catch (RestClientException rcEx) {
            System.out.println("\033[30;47m" + rcEx);
            return null;
        }
        try {
            return convertToRecalledVehicles(jsonString);
        } catch (IOException ioEx) {
            System.out.println("\033[30;47m" + ioEx);
            return null;
        }
    }

    public RecalledVehicles convertToRecalledVehicles(String jsonString) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(jsonString);

            RecalledVehicles recalledVehicles = mapper.readValue(jsonString, RecalledVehicles.class);

            return recalledVehicles;
        } catch (IOException ioEx) {
            System.out.println("\033[30;47m" + ioEx);
            return null;
        }
    }

    /* works */
    public ResponseEntity<String> getRecallsEntity() {
        /* get data, perform business logic, return built domain object. */
        return template.getForEntity(recalledVehiclesURL, String.class);
    }

}

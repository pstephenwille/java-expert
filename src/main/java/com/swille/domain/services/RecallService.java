package com.swille.domain.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.swille.domain.repository.RecalledVehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
* domain service
* handles business logic
* applies business logic to build domain entities */
@Service
public class RecallService {

    @Autowired
    private RestTemplate template;
    @Value("${data.nhtsa.recalls.url}")
    private String recallUrl;

    public RecalledVehicles getRecalls() throws RestClientException, IOException {
        /* get data, perform business logic, return built domain object. */
        try {
            String jsonString = getRecalledVehicles();
            return convertToRecalledVehicles(jsonString);
        } catch (RestClientException | IOException ex) {
            System.out.println("\033[30;47m" + ex);
            return null;
        }
    }

    private String getRecalledVehicles() throws RestClientException {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("make", "saturn");
        paramsMap.put("year", "2000");

        return template.getForEntity(recallUrl, String.class, paramsMap).getBody();
    }

    private RecalledVehicles convertToRecalledVehicles(String jsonString) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonString, RecalledVehicles.class);
    }

    public ResponseEntity<String> getRecallsEntity() {
        /* get data, perform business logic, return built domain object. */
        Map<String, String> map = new HashMap<String, String>();
        map.put("year", "2011");

        return template.getForEntity(recallUrl, String.class, map);
    }

}

package com.swille.domain.services;


import com.swille.domain.models.Pojo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/*
* domain service
* handles business logic
* applies business logic to build domain entities */
@Service
public class PojoService {

    private RestTemplate template = new RestTemplate();
    private String url = "https://one.nhtsa.gov/webapi/api/Recalls/vehicle/modelyear/2012/make/bmw/model/3-series?format=json";


    public Pojo getRecalls() throws RestClientException {
        /* get data, perform business logic, return built domain object. */
        try {
            return template.getForObject(url, Pojo.class);
        } catch (RestClientException ex) {
           System.out.println("\033[30;47m" + ex);
        }
        return null;
    }

}

package com.swille.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle {
    @JsonProperty("modelYear")
    private String modelyear;
    @JsonProperty("make")
    private String make;
    @JsonProperty("model")
    private String model;
}

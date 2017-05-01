package com.swille.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle {
    @JsonProperty("ModelYear")
    private String modelyear;
    @JsonProperty("Make")
    private String make;
    @JsonProperty("Model")
    private String model;
}

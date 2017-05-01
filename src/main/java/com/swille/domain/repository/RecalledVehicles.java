package com.swille.domain.repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swille.domain.models.Vehicle;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecalledVehicles {

    private int count;

    @JsonProperty(value = "count")
    public int getCount() {
        return count;
    }
    @JsonProperty(value = "Count")
    public void setCount(int count) {
        this.count = count;
    }

    @JsonProperty("Message")
    private String message;
    @JsonProperty("Results")
    private List<Vehicle> results;

}

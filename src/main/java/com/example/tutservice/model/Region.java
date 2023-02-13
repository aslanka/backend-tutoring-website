package com.example.tutservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Region {
    private String state;
    private String city;
    private int zipcode;

    public Region(@JsonProperty("state") String state,
                  @JsonProperty("city") String city,
                  @JsonProperty("zipcode") int zipcode){
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
    }
}

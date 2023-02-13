package com.example.tutservice.model;

import com.example.tutservice.model.Tutor_Enums.classYear;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class University {

    private String UniversityName;
    private String major;
    private String class_year;

    public University(@JsonProperty("schoolName") String UniversityName,
                 @JsonProperty("major") String major,
                 @JsonProperty("classYear") String class_year){
        this.UniversityName = UniversityName;
        this.major = major;
        this.class_year = class_year;


    }

}

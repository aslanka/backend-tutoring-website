package com.example.tutservice.model;

import com.example.tutservice.model.Tutor_Enums.Positions;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.UUID;
//STILL NEED REGION INFO FOR TUTORS
//COURSES TUTORS CAN TEACH
//HIRED DATE
//JOB POSITION
@Data
@Document
public class Employee {


    private UUID employee_id;
    private String full_name;
    private int age;
    private String teaching_method;
    private University university;
    private Positions jobPosition;
    private String hireDate;
    private Region region;
    private String[] courses;
    private String bio;
    private String profile_picture;
    //
//    public UUID getEmployee_id() {
//        return employee_id;
//    }
//
//    public String getFull_name() {
//        return full_name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getTeaching_method() {
//        return teaching_method;
//    }
//
//    public University getUniversity() {
//        return university;
//    }

    public Employee(@JsonProperty("name") String full_name,
                    @JsonProperty("age") int age,
                    @JsonProperty("method") String teaching_method,
                    @JsonProperty("school") University university,
                    @JsonProperty("position") Positions jobPosition,
                    @JsonProperty("hire-date") String hireDate,
                    @JsonProperty("Region") Region region,
                    @JsonProperty("courses") String[] courses,
                    @JsonProperty("bio") String bio,
                    @JsonProperty("profile_picture") String profile_picture){
        this.full_name = full_name;
        this.age = age;
        this.teaching_method = teaching_method;
        this.university = university;
        this.jobPosition = jobPosition;
        this.hireDate = hireDate;
        this.region = region;
        this.courses = courses;
        this.bio = bio;
        this.profile_picture = profile_picture;
    }
}

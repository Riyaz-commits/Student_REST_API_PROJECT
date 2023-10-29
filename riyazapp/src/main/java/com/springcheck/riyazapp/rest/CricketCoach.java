package com.springcheck.riyazapp.rest;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach{

    public String getDailyWorkout() {
        return "Practise catches atleast 20 minutes";
    }
}

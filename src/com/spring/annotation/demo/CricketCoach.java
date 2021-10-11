package com.spring.annotation.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 1 hour.";
    }

}

package com.spring.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach{

    @Autowired
    private HappyFortuneService happyFortuneService;

    @Override
    public String getMyDailyWorkout() {
        return "Exercise daily for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return happyFortuneService.getDailyFortune();
    }

}
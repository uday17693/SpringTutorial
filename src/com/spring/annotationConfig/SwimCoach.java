package com.spring.annotationConfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${team.name}")
    private String teamName;

    @Value("${team.email}")
    private String teamEmail;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyRoutine() {
        return "Swim daily for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamEmail() {
        return teamEmail;
    }
}

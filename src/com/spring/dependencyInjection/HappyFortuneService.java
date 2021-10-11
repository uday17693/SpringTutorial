package com.spring.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Today is a lucky day..!";
    }

}

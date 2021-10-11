package com.spring.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dependencyInjection_applicationContext.xml");

        Coach coach = classPathXmlApplicationContext.getBean("fitnessCoach", Coach.class);

        System.out.println(coach.getMyDailyWorkout());
        System.out.println(coach.getDailyFortune());

    }

}

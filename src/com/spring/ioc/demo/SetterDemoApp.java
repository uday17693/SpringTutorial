package com.spring.ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach coach = classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        classPathXmlApplicationContext.close();

    }

}

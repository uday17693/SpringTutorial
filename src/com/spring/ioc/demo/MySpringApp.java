package com.spring.ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        classPathXmlApplicationContext.close();

    }

}

package com.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotation_applicationContext.xml");

        Coach coach = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

    }

}

package com.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotation_applicationContext.xml");

        Coach coach_1 = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);
        Coach coach_2 = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);

        System.out.println(coach_1);
        System.out.println(coach_2);

    }

}

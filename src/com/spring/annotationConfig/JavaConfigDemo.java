package com.spring.annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = annotationConfigApplicationContext.getBean("cricketCoach", Coach.class);
        Coach swimCoach = annotationConfigApplicationContext.getBean("swimCoach", Coach.class);
        System.out.println(coach.getDailyRoutine());
        System.out.println(swimCoach.getDailyRoutine());
        System.out.println(swimCoach.getDailyFortune());
    }

}

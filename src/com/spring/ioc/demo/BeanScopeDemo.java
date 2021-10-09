package com.spring.ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");

        Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        System.out.println(theCoach);

        System.out.println(alphaCoach);

    }

}

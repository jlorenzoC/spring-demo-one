package com.jayjay.first.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // use the object
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}

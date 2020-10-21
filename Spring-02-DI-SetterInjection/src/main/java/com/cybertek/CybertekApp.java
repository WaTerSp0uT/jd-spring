package com.cybertek;

import com.cybertek.inerfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();

        Course course2 =(Course)container.getBean("selenium");
        course2.getTeachingHours();


    }
}

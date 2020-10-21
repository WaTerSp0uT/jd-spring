package com.cybertek.services;

import com.cybertek.inerfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println( "Selenium Course: 3500 Baby !!!");
    }
}

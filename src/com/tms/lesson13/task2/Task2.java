package com.tms.lesson13.task2;

import java.util.Calendar;
import java.util.Date;

public class Task2 {

    public static void main(String[] args) {
        day();
    }

    private static void day(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 9);
        Date tuesday = calendar.getTime();
        System.out.println(tuesday);
    }
}

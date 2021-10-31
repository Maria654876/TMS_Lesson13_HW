package com.tms.lesson13.task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        day();
    }

    private static void day() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in the format dd/MM/yyyy");
        String dateScanner = scanner.nextLine();
        Date date = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = dt.parse(dateScanner);
            DateFormat day = new SimpleDateFormat("EEEE");
            String FDay = day.format(date);
            System.out.println(FDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

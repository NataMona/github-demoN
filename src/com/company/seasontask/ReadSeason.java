package com.company.seasontask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadSeason {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String month = br.readLine();
        Season season = null;
        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month");
        }
        if (season != null) {
            System.out.println(season);
        }
    }
}

enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}
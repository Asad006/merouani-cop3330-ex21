package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int monthNumber;
        String month;

        App app = new App();

        System.out.println("Please enter the number of the month:");
        monthNumber = Integer.parseInt(scanner.nextLine());

        month = app.getMonth(monthNumber);

        System.out.printf("The name of the month is %s.",month);

    }

    private String getMonth(int monthNumber) {
        String month= "";
        switch (monthNumber) {
            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
            break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        return month;
    }
}

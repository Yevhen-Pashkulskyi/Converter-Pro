package main.java;

import java.util.Scanner;

public class App {
    private static final double MILLI = 1.60934;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input milli: ");
        double milli = sc.nextDouble();
        double res = milliToKilometre(milli);
        print(res,"Kilometre: ");

        System.out.print("Input kilometre: ");
        double kilometre = sc.nextDouble();
        res = kilometreToMilli(kilometre);
        print(res, "Milli: ");
    }

    private static double milliToKilometre(double milli) {
        return milli * MILLI;
    }

    private static double kilometreToMilli(double kilometre) {
        return kilometre / MILLI;
    }
    private static void print(double res, String message) {
        System.out.println(message + res);
    }
}

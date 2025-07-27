package main.java;

import java.util.Scanner;

public class App {
    private static final double MILLI = 1.60934;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double milli = sc.nextDouble();
        double res = milliToKilometre(milli);
    }

    private static double milliToKilometre(double milli) {
        return milli * MILLI;
    }
}

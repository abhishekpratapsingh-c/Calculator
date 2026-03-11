package org.example;

import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter your choice");
            System.out.println("1. Square Root ");
            System.out.println("2. Factorial ");
            System.out.println("3. Natural Log ");
            System.out.println("4. Power ");
            System.out.println("5. Exit");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter number  ");
                    double x = scanner.nextDouble();
                    System.out.println("Result " + Math.sqrt(x));
                    break;
                case 2:
                    System.out.print("Enter integer ");
                    int n = scanner.nextInt();
                    System.out.println("Result " + factorial(n));
                    break;
                case 3:
                    System.out.print("Enter number  ");
                    double l = scanner.nextDouble();
                    System.out.println("Result " + Math.log(l));
                    break;
                case 4:
                    System.out.print("Enter base   ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent ");
                    double exp = scanner.nextDouble();
                    System.out.println("Result " + Math.pow(base, exp));
                    break;
            }
        } while (choice != 5);
    }


    public static long factorial(int n) {
        if (n < 0) return -1;
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }
}
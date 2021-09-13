/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double p = in.nextDouble();

        System.out.print("What is the rate? ");
        double r = in.nextDouble();

        System.out.print("What is the number of years? ");
        double t = in.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        double x = in.nextDouble();

        double A = p * (Math.pow(1 +((r*0.01)/x), (x * t )));
        int y=(int)t;
        int z=(int)p;
        int w=(int)x;

        System.out.print("$"+z+" invested at "+r+"% for " +y+ " years compounded "+w+" per year is $");
        System.out.printf("%.2f", A);
        System.out.print(".");

    }
}

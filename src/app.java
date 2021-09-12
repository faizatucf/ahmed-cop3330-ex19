/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class BMI {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag = -1;
        double height, weight, bmi;
        String output;
         System.out.println("**************************");
        System.out.println("******BMI CALCULATOR******");
        System.out.println("**************************\n\n");
        System.out.println("Enter your height in INCHES:");
        height = sc.nextDouble();
        System.out.println("Enter your weight:");
        weight = sc.nextDouble();
        bmi = 703.0 * weight / Math.pow(height,2) ;
        if (bmi >= 18.5 && bmi <= 25)
        System.out.println(String.format("Your BMI is %.2f.\nYou are within the ideal weight range.",bmi));
        else if(bmi < 18.5)
        System.out.println(String.format("Your BMI is %.2f.\nYou are underweight. You should see your doctor.",bmi));
        else
        System.out.println(String.format("Your BMI is %.2f.\nYou are overweight. You should see your doctor.",bmi));
    }
}
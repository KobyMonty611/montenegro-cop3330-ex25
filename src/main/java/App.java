/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {

    public static void passwordValidator(String input)
    {
        String strength;

        int n = input.length();
        boolean isLower = false, isUpper = false, isDigit = false, specialChar = false;


        for (int i =0; i < input.length(); i++)
        {
            if (Character.isLowerCase(i))
            {
                isLower = true;
            }
            if (Character.isUpperCase(i))
            {
                isUpper = true;
            }
            if (Character.isDigit(i))
            {
                isDigit = true;
            }
            if (!Character.isLowerCase(i)&& !Character.isUpperCase(i)&&!Character.isDigit(i))
            {
                specialChar = true;
            }
        }

        if (isDigit && (isLower || isUpper) && specialChar && (n >= 8))
        {
            strength = "very strong";
        }
        else if (((isLower || isUpper) && isDigit) && (n >= 8))
        {
            strength = "strong";
        }
        else if((isLower || isUpper) && (n < 8))
        {
            strength = "weak";
        }
        else
        {
            strength = "very weak";
        }

        String output = String.format("The password '" + input + "' is a " + strength + " password.");

        System.out.print(output);
    }


    public static void main(String[] args)
    {
        String input;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input = scan.nextLine();
        passwordValidator(input);
        scan.close();
    }


}
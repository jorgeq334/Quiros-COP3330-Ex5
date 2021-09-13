package org.example;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Math
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "Enter first number." );
        String first= input.nextLine();
        Scanner tinput=new Scanner(System.in);
        System.out.println( "Enter second number." );
        String second= tinput.nextLine();
        int firstNumber=Integer.parseInt(first);
        int secondNumber=Integer.parseInt(second);

        int sum= firstNumber + secondNumber;
        int dif = firstNumber - secondNumber;
        int mult= firstNumber * secondNumber;
        int div= firstNumber / secondNumber;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + dif);
        System.out.println(first + " x " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + div);


    }
}

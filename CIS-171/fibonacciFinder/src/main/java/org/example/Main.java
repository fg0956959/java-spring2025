package org.example;
import java.util.Scanner;
/*Franklin Gainer
* 03-11-2025
* CIS 170-101
* Professor Lawrence*/


public class Main {
    static int fib(int n)//fibonacci method that returns the result of the function
    {
        try
        {//try-catch block to catch any exceptions
            if(n < 0)
                System.out.println("Invalid Input");
            else if(n == 0 || n == 1)//if-statement that returns the value of the n, whcih'll be for user input and ensure that non negative numbers are inputed only
                return n;
            else return fib(n-1) + fib(n-2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);//scanner object for user input
        System.out.println("Enter you fibonacci number: ");//a printline which ask for a user to enter a number
        int FibFinder = userInput.nextInt();//an integer used to put in the fib finder

        System.out.println("Fibonacci number of " + FibFinder + " 8is: " + fib(FibFinder));// a printline which states the result of the fibonacci position of the users input
    }
}
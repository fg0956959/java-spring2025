/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatortest;


/**
 * @author Franklin Gainer
 * CIS-171
 * 01-29-2025
 * professor Lawrence
 */

class Calculator//calculator class to test
{
    private int sum1;//private feilds for calculator class
    private int sum2;
    
    public Calculator(int Sum1, int Sum2)
    {this.sum1 = Sum1; this.sum2 = Sum2;}
    
    public int getIntOne(int intOne)
    {return sum1;}
    
    public int getIntTwo(int intTwo)
    {return sum2;}//getters for the feilds
    
    public void setIntOne(int Sum1)
    {this.sum1 = Sum1;}
    
    public void setSumTwo(int Sum2)
    {this.sum2 = Sum2;}//setters for the feilds
    
    public static int add(int a, int b)
    {return a + b;}
    
    public static int sub(int a, int b)
    {return a - b;}
    
    public static int multiply(int a, int b)
    {return a * b;}
    
    public static int divide(int a, int b)//add, subtract, multiply, and divide methods that return an expeded arithmatic result
    {
        try {
            int result =  a / b;
        
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught " + e.getMessage());
        }
        return a / b;//try catch case for the divide methd that throws an arithmatic expectation case
    }
    
    
}
public class CalculatorTest 
{

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int exampleOne = 10;
        int exampleTwo = 2;
        
        
        Calculator calc1 = new Calculator(exampleOne, exampleTwo);
    }
}

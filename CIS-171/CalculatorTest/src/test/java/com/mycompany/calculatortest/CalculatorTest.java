/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculatortest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Franklin Gainer
 * CIS-171
 * 01-29-2025
 * professor Lawrence
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass(){}     /**
     * Test of getIntOne method, of class Calculator.
     */
    @Test
    public void testGetIntOne() {
        System.out.println("getIntOne");
        int intOne = 0;
        Calculator instance = null;
        int expResult = 0;
        int result = instance.getIntOne(intOne);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntTwo method, of class Calculator.
     */
    @Test
    public void testGetIntTwo() {
        System.out.println("getIntTwo");
        int intTwo = 0;
        Calculator instance = null;
        int expResult = 0;
        int result = instance.getIntTwo(intTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntOne method, of class Calculator.
     */
    @Test
    public void testSetIntOne() {
        System.out.println("setIntOne");
        int Sum1 = 0;
        Calculator instance = null;
        instance.setIntOne(Sum1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSumTwo method, of class Calculator.
     */
    @Test
    public void testSetSumTwo() {
        System.out.println("setSumTwo");
        int Sum2 = 0;
        Calculator instance = null;
        instance.setSumTwo(Sum2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 10;
        int b = 2;
        int expResult = 12;
        int result = Calculator.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");//test case for positive numbers
    }
    
    @Test
    public void testAddTwo() {
        System.out.println("add");
        int a = 2;
        int b = -6;
        int expResult = -4;
        int result = Calculator.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");//test case for negative numbers
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculator.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculator.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculator.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

{
    }
    
}

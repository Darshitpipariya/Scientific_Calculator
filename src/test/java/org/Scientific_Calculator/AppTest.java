package org.Scientific_Calculator;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static final double DELTA= 1e-15;
    App obj=new App();
    @Test
    public void squareTruePositive(){
        assertEquals("Finding Square root of a number for True Positive",4,obj.squareRoot(16),DELTA);
        assertEquals("Finding Square root of a number for True Positive",2,obj.squareRoot(4),DELTA);
    }
    @Test
    public void squareFalsePositive(){
        assertNotEquals("Finding Square root of a number for false Positive",2,obj.squareRoot(16),DELTA);
        assertNotEquals("Finding Square root of a number for false Positive",1,obj.squareRoot(4),DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive",120,obj.factorial(5));
        assertEquals("Finding factorial of a number for True Positive",24,obj.factorial(4));
    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for false Positive",100,obj.factorial(5));
        assertNotEquals("Finding factorial of a number for false Positive",20,obj.factorial(4));
    }

}
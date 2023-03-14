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
    @Test
    public void logTruePositive(){
        assertEquals("Finding Natural log of a number for True Positive",2.302585092994046,obj.naturalLog(10),DELTA);
        assertEquals("Finding Natural log of a number for True Positive",1.3862943611198906,obj.naturalLog(4),DELTA);
    }
    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding Natural log of a number for false Positive",2.3025,obj.naturalLog(16),DELTA);
        assertNotEquals("Finding Natural log of a number for false Positive",1.2862,obj.naturalLog(20),DELTA);
    }
    @Test
    public void powerTruePositive(){
        assertEquals("Finding POWER of a number for True Positive",9765625,obj.power(5,10),DELTA);
        assertEquals("Finding POWER of a number for True Positive",1024,obj.power(4,5),DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding POWER of a number for false Positive",100,obj.power(5,10),DELTA);
        assertNotEquals("Finding POWER of a number for false Positive",102,obj.power(4,5),DELTA);
    }

}
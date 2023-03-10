package org.Scientific_Calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App obj=new App();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive",120,obj.factorial(5));

        assertEquals("Finding factorial of a number for True Positive",24,obj.factorial(4));    }

}
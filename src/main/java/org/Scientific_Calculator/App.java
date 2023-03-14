package org.Scientific_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger =LogManager.getLogger(App.class);
    public App(){

    }
    public static void main( String[] args )
    {
        App app=new App();
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Scientific Calculator ,Choose to perform Operation");
            System.out.println("1: Square root\n2: Factorial\n3: Natural logarithm");
            int choice;
            int n;
            double num1,num2;
            try{
                choice= sc.nextInt();
            }catch (InputMismatchException e){
                return ;
            }
            switch (choice){
                case 1:
                    // Square root function
                    System.out.println("Enter the number : ");
                    num1= sc.nextDouble();
                    System.out.println("Square root of "+num1+" is "+app.squareRoot(num1));
                    System.out.println("");
                    break;
                case 2:
                    //Factorial function
                    System.out.println("Enter the number : ");
                    n=sc.nextInt();
                    System.out.println("Factorial of "+n+" is "+app.factorial(n));
                    System.out.println("");
                    break;
                case 3:
                    //Natural log function
                    System.out.println("Enter the number : ");
                    num1=sc.nextDouble();
                    System.out.println("Natural log of "+num1+" is "+app.naturalLog(num1));
                    System.out.println("");
                    break;
                default:
                    System.out.println("Exit");
                    return;
            }
        }while (true);
    }
    public double squareRoot(double num1){
        logger.info("[SQUARE ROOT] - "+num1);
        double result=Math.sqrt(num1);
        logger.info("[SQUARE ROOT RESULT] - "+result);
        return result;
    }
    public int factorial(int n){
        logger.info("[FACTORIAL OF] - "+n);
        int result=factorialCal(n);
        logger.info("[FACTORIAL RESULT] - "+result);
        return result;
    }
    public double naturalLog(double n){
        logger.info("[NATURAL LOGARITHM OF] - "+n);
        double result=Math.log(n);
        logger.info("[NATURAL LOGARITHM RESULT] - "+result);
        return result;
    }
    public int factorialCal(int n){
        if(n==1){
            return 1;
        }
        return n*factorialCal(n-1);
    }
}

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
        double num1,num2;
        do{
            System.out.println("Scientific Calculator ,Choose to perform Operation");
            System.out.println("1: Square root function\n");
            int choice;
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
                default:
                    System.out.println("Exit");
                    return;
            }
        }while (true);
    }
    public double squareRoot(double num1){
        logger.info("[SQUARE ROOT] - "+num1);
        double result=Math.sqrt(num1);
        logger.info("[SQUARE ROOT] - "+num1);
        return result;
    }
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

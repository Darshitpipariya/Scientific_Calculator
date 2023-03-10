package org.Scientific_Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        App obj=new App();
        System.out.println(obj.factorial(n));
    }
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

//Write a program which will take a number as input.
//If number is prime and odd, then it will throw Custom Exception with proper message Number is invalid.

import java.util.*;
import java.io.*;

//Creating Custom Exception
class NumException extends Exception
{
    public NumException(String s)       //Passing String so that we can use the method getMessage()
    {
        super(s);       //Calling constructor from super class
    }
}

class Number
{
    static int i = 2;

    //Function to check whether a number is Prime or not
    public static boolean isPrime(int n)
    {
        //0 and 1 are prime numbers
        if(n==0 || n==1)
        {
            return false;
        }

        //2 is also Prime number
        if(n==i)
        {
            return true;
        }

        //Checking for Prime for numbers after 2.
        if(n % i == 0)
        {
            return false;
        }
        i++;
        return isPrime(n);  //Returns boolean value True or False
    }

    public static void main(String args[])
    {
        //Taking the input number
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("\nEnter a number:");
        num = sc.nextInt();

        //Checking for Exception case
        try {
            if(isPrime(num))       //If a number is even it will never be Prime
            {
                throw new NumException("Number is Invalid!");      //Exception thrown
            }
            else
            {
                System.out.println("No Exception!");            //No Exception Condition
            }
        } catch (NumException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());         //If Exception is caught, message will be displayed
        }
    }
}
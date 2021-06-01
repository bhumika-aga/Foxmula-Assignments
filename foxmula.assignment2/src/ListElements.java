//Write a program to check whether an ArrayList contains an element or not.

import java.io.*;
import java.util.*;

class ListElements
{
    public static void main(String args[])
    {
        int n;
        String str;
        Scanner sc = new Scanner(System.in);
        
        //Creating a new ArrayList
        ArrayList<String> list = new ArrayList<String>();
        while(true)
        {
            System.out.println("\n\n1. Add Element to ArrayList\n2. Check if the List contains an Element\n3. Exit");
            System.out.println("Enter your choice:");
            n = sc.nextInt();
            switch(n)
            {
                case 1:     //Adding elements to it
                System.out.println("Enter the element:");
                str = sc.next();
                list.add(str);
                break;

                case 2:     //Checking if List contains the element
                System.out.println("Enter the element to be checked:");
                str = sc.next();
                if(list.contains(str))
                {
                    System.out.println(list.contains(str));
                    break;
                }
                else
                {
                    System.out.println(list.contains(str));
                    break;
                }
            
                default:    //Default case
                System.out.println("Exit!");
                return;
            }
        }
    }
}
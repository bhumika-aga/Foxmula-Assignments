//Write a program to traverse HashSet.

import java.io.*;
import java.util.*;

class HashTraverse
{
    public static void main(String args[])
    {
        int choice;
        String str;
        Scanner sc = new Scanner(System.in);
        
        //Creating a new HashSet
        HashSet<String> hash = new HashSet<String>();

        while(true)
        {
            System.out.println("\n\n1. Add Element to HashSet\n2. Traverse the List\n3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:     //Adding elements to HashSet
                System.out.println("Enter the element:");
                str = sc.next();
                hash.add(str);
                break;

                case 2:     //Traversing and Printing the HashSet
                Iterator<String> i = hash.iterator();       //Initialising Iterator
                while(i.hasNext())
                {
                    System.out.println(i.next());
                }
                break;
            
                default:    //Default case
                System.out.println("Exit!");
                return;
            }
        }
    }
}
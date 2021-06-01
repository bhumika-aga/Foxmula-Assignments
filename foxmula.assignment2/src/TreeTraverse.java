//Write a program to traverse Tree Set.

import java.io.*;
import java.util.*;

class TreeTraverse
{
    public static void main(String args[])
    {
        int choice;
        String str;
        Scanner sc = new Scanner(System.in);
        
        //Creating new TreeSet
        TreeSet<String> tree = new TreeSet<String>();

        while(true)
        {
            System.out.println("\n\n1. Add Element to HashSet\n2. Traverse the List\n3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:     //Adding elements to TreeSet
                System.out.println("Enter the element:");
                str = sc.next();
                tree.add(str);
                break;

                case 2:     //Traversing and Printing the TreeSet
                Iterator<String> i = tree.iterator();       //Initialising Iterator
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
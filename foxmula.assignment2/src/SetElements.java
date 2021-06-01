//Write a program to check whether set contains an element or not.

import java.io.*;
import java.util.*;

class SetElements
{
    public static void main(String args[])
    {
        int choice, choice1;
        String str;
        Scanner sc = new Scanner(System.in);
        
        //Creating Sets
        HashSet<String> set1 = new HashSet<String>();
        LinkedHashSet<String> set2 = new LinkedHashSet<String>();
        TreeSet<String> set3 = new TreeSet<String>();

        while(true)
        {
            System.out.println("\n\n1. Add Element to HashSet\n2. Add Element to LinkedHashSet\n3. Add Element to TreeSet\n4. Check if the List contains an Element\n5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:     //Adding elements to HashSet
                System.out.println("Enter the element:");
                str = sc.next();
                set1.add(str);
                break;

                case 2:     //Adding elements to LinkedHashSet
                System.out.println("Enter the element:");
                str = sc.next();
                set2.add(str);
                break;

                case 3:     //Adding elements to TreeSet
                System.out.println("Enter the element:");
                str = sc.next();
                set3.add(str);
                break;

                case 4:     //Checking if List contains the element
                System.out.println("\n1. HashSet\n2. LinkedHashSet\n3. TreeSet\n");
                System.out.println("Enter the Set to be checked from: ");
                choice1 = sc.nextInt();
                switch(choice1)
                {
                    case 1:     //Checking for HashSet
                    System.out.println("\nEnter the element to be checked:");
                    str = sc.next();
                    if(set1.contains(str))
                    {
                        System.out.println(set1.contains(str));
                        break;
                    }
                    else
                    {
                        System.out.println(set1.contains(str));
                        break;
                    }

                    case 2:     //Checking for LinkedHashSet
                    System.out.println("\nEnter the element to be checked:");
                    str = sc.next();
                    if(set2.contains(str))
                    {
                        System.out.println(set2.contains(str));
                        break;
                    }
                    else
                    {
                        System.out.println(set2.contains(str));
                        break;
                    }

                    case 3:     //Checking for TreeSet
                    System.out.println("\nEnter the element to be checked:");
                    str = sc.next();
                    if(set3.contains(str))
                    {
                        System.out.println(set3.contains(str));
                        break;
                    }
                    else
                    {
                        System.out.println(set3.contains(str));
                        break;
                    }
                }
                break;
            
                default:    //Default case
                System.out.println("Exit!");
                return;
            }
        }
    }
}
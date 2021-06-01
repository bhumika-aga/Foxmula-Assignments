//Write a program to calculate occurrences of each element of an ArrayList.

import java.io.*;
import java.util.*;

class Occurrence
{
    //Function to calculate occurrences of each element in the list
    public static void count(ArrayList<String> arr)
    {
        //Create a new HashSet and insert the elements of List into it
        HashSet<String> hash = new HashSet<String>(arr);

        //Count and Print the occurrence of each word in the ArrayList
        for(String s : hash)
        {
            System.out.println(s+": "+Collections.frequency(arr, s));
        }
    }
    
    public static void main(String args[])
    {
        int n;
        String str;
        Scanner sc = new Scanner(System.in);
        
        //Create a new ArrayList
        ArrayList<String> arr = new ArrayList<String>();

        while(true)
        {
            System.out.println("\n\n1. Add Element to ArrayList\n2. Check if the occurrence of each element\n3. Exit");
            System.out.println("Enter your choice:");
            n = sc.nextInt();
            switch(n)
            {
                case 1:     //Adding elements to ArrayList
                System.out.println("Enter an element:");
                str = sc.next();
                arr.add(str);
                break;

                case 2:     //Counting the occurrence of each word in the ArrayList
                count(arr);
                break;
            
                default:    //Default case
                System.out.println("Exit!");
                return;
            }
        }
    }
}
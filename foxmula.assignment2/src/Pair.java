//Write a program to find the Pair from an array list whose sum will be K, where K will be taken as input.

import java.io.*;
import java.util.*;

class Pair
{
    static void hasPair(ArrayList<Integer> arr, int sum)
    {
        //Creating a new HashSet to store the pair
        HashSet<Integer> hash = new HashSet<Integer>();
        
        //Checking for such pairs
        for(Integer i : arr)
        {
            int temp = sum - i;
            if(hash.contains(temp))
            {
                System.out.println("Pair with sum "+sum+" is ("+i+" , "+temp+")");
            }
            hash.add(i);        //Adding the pair to the HashSet to print
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Create a new ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(true)
        {
            System.out.println("\n\n1. Add Element to ArrayList\n2. Check if the pair exists\n3. Exit");
            System.out.println("Enter your choice:");
            int n = sc.nextInt();
            int k;
            switch(n)
            {
                case 1:     //Adding elements to ArrayList
                System.out.println("Enter an element:");
                k = sc.nextInt();
                arr.add(k);
                break;

                case 2:     //Checking if List contains the Pair whose sum is k
                System.out.println("Enter the Sum:");
                k = sc.nextInt();
                hasPair(arr, k);
                break;
            
                default:    //Default case
                System.out.println("Exit!");
                return;
            }
        }
    }
}
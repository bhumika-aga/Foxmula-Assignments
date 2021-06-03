//Write a program calculate frequency/occurrences of each element of an array 
//and then sort by value and then print it.

import java.util.*;
import java.io.*;
import java.lang.*;

class SortedFrequency
{
    //Method to Count frequency of each element in an array 
    //and sort the elements according to their frequencies
    static void countFreq(int arr[], int len)
    {
        //Creating a HashMap to store the elements of array
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        //Traversing through the elements and counting their frequencies
        for(int i = 0; i<len; i++)
        {
            if(hash.containsKey(arr[i]))
            {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            }
            else
            {
                hash.put(arr[i], 1);
            }
        }
        
        //Sorting the HashMap according to the frequencies
        HashMap<Integer, Integer> newHash = sortHash(hash);

        //Printing frequencies of each element
        for(Map.Entry<Integer, Integer> entry : newHash.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    //Method to sort HashMap Values
    public static HashMap<Integer, Integer> sortHash(HashMap<Integer, Integer> hash)
    {
        //Creating a LinkedList and storing the keys and values of HashMap in it
        LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hash.entrySet());

        //Sorting the list according to values using Comparator Interface
        Collections.sort(list, new Comparator<HashMap.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> i1, Map.Entry<Integer, Integer> i2)
            {
                return (i1.getValue()).compareTo(i2.getValue());
            }
        });

        //Storing the sorted values in a new Map
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for(Map.Entry<Integer, Integer> m : list)
        {
            sortedMap.put(m.getKey(), m.getValue());
        }
        return sortedMap;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Creating an array of user defined size
        System.out.println("Enter the size of the Array:");
        int s = sc.nextInt();
        int arr[] = new int[s];
        int len = arr.length;

        while(true)
        {
            System.out.println("\n\n1. Add Element to the Array\n2. Show Frequency of each element\n3. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:     //Adding elements to the Array
                System.out.println("Enter the elements of the Array:");
                for(int i=0; i<s; i++)
                {
                    arr[i] = sc.nextInt();
                }
                break;

                case 2:     //Displaying the elements according to sorted frequencies
                countFreq(arr, len);
                break;

                default:    //Default case to exit
                System.out.println("Exit!");
                return;
            }
        }
    }
}
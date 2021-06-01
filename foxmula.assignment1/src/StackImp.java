//Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and 
//checkEmpty ( ) operations on the stack. 
//Create two stacks and write a menu-driven program to perform operations on the two stacks. 
//Whenever the number of elements in the two stacks becomes equal, 
//a message should automatically be generated displaying the number of elements in each stack.

import java.util.*;
import java.io.*;

class Stack
{
    Node head; //head of the list Stack
    public int count = 0;
    
    //Node
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //To check if the stack is empty
    boolean checkEmpty()
    {
        return count == 0;
    }
    
    //Insertion in stack
    public void push(int data)
    {
        //Insert new node
        Node node_new = new Node(data);
        if(checkEmpty())
        {
            head = node_new;
            count++;
        }
        else
        {
            node_new.next = head;
            head = node_new;
            count++;
        }
    }

    public void pop()
    {
        //Remove the node
        Node temp = head;
        head = head.next;
        count--;
    }
}

public class StackImp
{
    //If both stacks have the same number of elements, display the number of elements
    public void display(Stack st1, Stack st2)
    {
        if(st1.count==st2.count)
        {
            System.out.println("Total number of elements in both stacks is : "+st2.count);
        }
    }

    //Driver code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        int ch, data;
        StackImp si = new StackImp();
        while(true)
        {
            System.out.println("\n1. Push in Stack 1");
            System.out.println("\n2. Push in Stack 2");
            System.out.println("\n3. Pop in Stack 1");
            System.out.println("\n4. Pop in Stack 2");
            System.out.println("\nEnter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                st1.push(data);
                si.display(st1,st2);
                break;

                case 2:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                st2.push(data);
                si.display(st1,st2);
                break;

                case 3:
                //System.out.println(s1.pop());
                st1.pop();
                si.display(st1,st2);
                break;

                case 4:
                //System.out.println(s2.pop());
                st2.pop();
                si.display(st1,st2);
                break;

                default:
                System.out.println("NULL");
                break;
            }
        }
    }
}
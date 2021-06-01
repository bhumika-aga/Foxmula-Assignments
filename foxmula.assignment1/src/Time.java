//Create a class called Time, which has three private instance variables – hour, min and sec.
//It contains a method called add ( ) which takes one Time object as parameter and 
//print the added value of the calling Time object and passes Time object. 
//In the main method, declare two Time objects and assign values using constructor and 
//call the add ( ) method.

import java.util.*;

public class Time
{
    private int hour, min, sec;
    Time(int h, int m, int s)
    {
        hour=h;
        min=m;
        sec=s;
    }
    Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    public Time add(Time tx)
    {
        Time t= new Time();
        t.sec= this.sec+tx.sec;
        if(t.sec>60)
        {
            t.sec-=60;
            t.min++;
        }
        t.min += this.min + tx.min;
        if(t.min>60)
        {
            t.min-=60;
            t.hour++;
        }
        t.hour += this.hour +tx.hour;
        if(t.hour>24)
        {
            t.hour-=24;
        }
        return t;
    }

    void display(String str)
    {
        System.out.println(str+" "+hour+":"+min+":"+sec);
    }

    public static void main(String args[])
    {
        int hour1, min1, sec1;
        int hour2, min2, sec2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter hour1: ");
        hour1 = sc.nextInt();

        System.out.println("Enter hour2: ");
        hour2 = sc.nextInt();

        System.out.println("Enter min1: ");
        min1 = sc.nextInt();

        System.out.println("Enter min2: ");
        min2 = sc.nextInt();

        System.out.println("Enter sec1: ");
        sec1 = sc.nextInt();

        System.out.println("Enter sec2: ");
        sec2 = sc.nextInt();

        Time t1= new Time(hour1, min1, sec1);
        Time t2= new Time(hour2, min2, sec2);
        Time t3= t1.add(t2);
        t1.display("Time 1: ");
        t2.display("Time 2: ");
        t3.display("Time after addition: ");
    }
}
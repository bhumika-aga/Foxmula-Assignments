//Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. 
//Use Quadrilateral as the super class of the hierarchy. 
//The instance variables of Quadrilateral should be the x-y coordinate pairs 
//for the four endpoints of the Quadrilateral. 
//Write a program that instantiates objects of your classes and outputs each object's area (except Quadrilateral).

import java.util.*;

class Quadrilateral
{
    int x1, x2, x3, x4, y1, y2, y3, y4;
    void setCoordinates(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
    }
}

class Square extends Quadrilateral
{
    Square(int a, int b, int c, int d, int e, int f, int g, int h)
    {
        setCoordinates(a,b,c,d,e,f,g,h);
    }

    int area()
    {
        int d = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}

class Rectangle extends Quadrilateral
{
    Rectangle(int a, int b, int c, int d, int e, int f, int g, int h)
    {
        setCoordinates(a,b,c,d,e,f,g,h);   
    }

    int area()
    {
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2 = (int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}

class Trapezoid extends Quadrilateral
{
    private int height;
    Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h, int height)
    {
        setCoordinates(a,b,c,d,e,f,g,h);
        this.height = height;
    }

    int area()
    {
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2 = (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return (int)((d1+d2)*height)/2;
    }
}

class Parallelogram extends Quadrilateral
{
    private int height;
    Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h, int height)
    {
        setCoordinates(a,b,c,d,e,f,g,h);
        this.height = height;
    }

    int area()
    {
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d1*height;
    }
}

public class QuadInherit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4 , h;

        System.out.println("\nEnter the value of x1 : \n");
        x1 = sc.nextInt();

        System.out.println("\nEnter the value of y1 : \n");
        y1 = sc.nextInt();

        System.out.println("\nEnter the value of x2 : \n");
        x2 = sc.nextInt();

        System.out.println("\nEnter the value of y2 : \n");
        y2 = sc.nextInt();

        System.out.println("\nEnter the value of x3 : \n");
        x3 = sc.nextInt();

        System.out.println("\nEnter the value of y3 : \n");
        y3 = sc.nextInt();

        System.out.println("\nEnter the value of x4 : \n");
        x4 = sc.nextInt();

        System.out.println("\nEnter the value of y4 : \n");
        y4 = sc.nextInt();

        System.out.println("\nEnter the height : \n");
        h = sc.nextInt();

        Square sq = new Square(x1, x2, x3, x4, y1, y2, y3, y4);
        System.out.println("Area of the Square is "+sq.area());
        
        Rectangle rec = new Rectangle(x1, x2, x3, x4, y1, y2, y3, y4);
        System.out.println("Area of the Rectangle is "+rec.area());

        Parallelogram par = new Parallelogram(x1, x2, x3, x4, y1, y2, y3, y4, h);
        System.out.println("Area of the Parallelogram is "+par.area());

        Trapezoid trap = new Trapezoid(x1, x2, x3, x4, y1, y2, y3, y4, h);
        System.out.println("Area of the Trapezoid is "+trap.area());
    }
}
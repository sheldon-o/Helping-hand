package com.stackroute.basics;
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(final String[] args) {
        new RectanglePerimeter().getValues();

        
        
    }

    //get user input from console
    public void getValues() {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle:");
        
        final double length= scan.nextDouble();
        final double breadth=scan.nextDouble();
        final double res =new RectanglePerimeter().perimeterCalculator(length, breadth);
        System.out.println(res);
        scan.close();

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(final double length, final double breadth) {
        
        final double perimeter = 2 *(length + breadth);
        
        
        return perimeter;
    }
}

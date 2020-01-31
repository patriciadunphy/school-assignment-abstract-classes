package org.example;

public class App 
{
    public static void main( String[] args )
    {
       Circle circle = new Circle();
       circle.move();
       circle.setArea(5.0);
       System.out.println(circle.getArea());
       circle.setColour("red");
       System.out.println(circle.getColour());
       Triangle triangle = new Triangle();
       triangle.move();


    }
}

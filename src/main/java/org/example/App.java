package org.example;

public class App 
{
    public static void main( String[] args )
    {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
       Circle circle = new Circle();
       circle.move();
       circle.setArea(5.0);
       System.out.println("Cirkelns area: "+circle.getArea());
       circle.setColour("red");
       System.out.println("Cirkelns färg: "+circle.getColour());
       object.showMessage();
       Triangle triangle = new Triangle();
       triangle.move();


    }
}

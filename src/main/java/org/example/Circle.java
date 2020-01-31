package org.example;

public class Circle extends Shape {

    @Override
    public void move(){
        System.out.println("Rolls");
    }
    @Override
    public void setArea(double r){
        double area = r*r*Math.PI;
        this.area = area;
    }

}

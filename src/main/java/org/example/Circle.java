package org.example;

public class Circle extends Shape {

    @Override
    public void move(){
        System.out.println("Rolls");
    }
    @Override
    public void setArea(int length, int width){
        int area = length * width;
        this.area = area;
    }

}

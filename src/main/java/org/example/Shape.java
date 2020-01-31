package org.example;

public abstract class Shape {
    public String colour;
    public int area;

    public void move(){
        System.out.println("Walks");
    }
    public int getArea(){
       return this.area;
    }
    public void setArea(int length, int width){
        this.area = area;
    }
    public void setArea(int length, int width, int m){
        this.area = area;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return this.colour;
    }

}

//Circle class:

package com.mycompany.task6_shapes;


public class Circle {
    //class parameters:
    private float r;
    static final double Pi = 3.14159;

    //setter method for radious:
    public void setR(float r) {
        this.r = r;
    }

    //method to calculate perimeter:
    public double perimeter() {
        return Pi * r * 2;
    }

    //method to calculate : area:
    public double Area() {
        return r * r * Pi;
    }




}
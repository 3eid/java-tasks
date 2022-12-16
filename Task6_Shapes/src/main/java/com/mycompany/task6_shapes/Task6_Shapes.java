//calculating area and primeter of circle and triangle: 

package com.mycompany.task6_shapes;
import java.util.Scanner;

public class Task6_Shapes {

    public static void main(String[] args) {
        //let user choose circle (c) or Triangle (t):-
        System.out.println("Enter 'c' for circle, or 't' for triangle: ");
        Scanner s = new Scanner(System.in);
        char choice = s.next().charAt(0);

        //handling user choice with switch case:-
        switch (choice) {
            //case of circle:
            case 'c':
                //creating object of class Circle:
                Circle c1 = new Circle();

                //getting radious from user:
                System.out.println("Enter radious: ");
                c1.setR(s.nextFloat()); //setting radious of the object by user input

                //calculating and printing the output using Circle class methods:
                System.out.println("the circle perimeter = " + c1.perimeter() + " , Area= " + c1.Area());
                break;

                //case of triangle:
            case 't':
                //creating object of class Triangle:
                Triangle t1 = new Triangle();

                //getting sides from user:
                System.out.println("Enter your triangle sides: ");
                //setting sides of the object t1:
                t1.setA(s.nextFloat());
                t1.setB(s.nextFloat());
                t1.setC(s.nextFloat());
                //calculating and printing the output using Triangle class methods:
                System.out.println("The Triangle perimeter = " + t1.perimeter() + " , Area= " + t1.Area());
                break;
                //case of invalid user choice
            default:
                System.out.println("Invalid Input.");

        }


    }
}
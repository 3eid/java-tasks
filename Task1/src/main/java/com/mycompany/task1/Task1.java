// Convert ASCII Code into character program

package com.mycompany.task1;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
       
        // input code from user:-
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Ascii Code: ");
        int input = s.nextInt(); //store the input into it input

        //convert code to char:
        char ascii = (char) input;

        //print output
        System.out.println("YOUR CHAR IS: " + ascii);

    }
}
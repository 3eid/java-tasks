//remove commas from a string:

package com.mycompany.task5_string_replace;

import java.util.Scanner;
public class Task5_string_replace {

    public static void main(String[] args) {
        //getting input string from user:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = s.nextLine();

        //removing comaas from string by replacing it with null character \0
        String output = input.replace(',', '\0');

        //printing output to the user:
        System.out.println("the output string without commas: ( " + output + " )");
    }
}
// max element of an array:

package com.mycompany.task3_max_of_array;

import java.util.Scanner;
public class Task3_max_of_array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //getting size of an array from user:
        System.out.println("Enter the number of array elements: ");
        int num = s.nextInt();

        //initialize the array of that user:
        int[] arr = new int[num];

        //getting the array from user:
        System.out.println("Enter your array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }

        //calculating max element of that array:
        int max = arr[0];

        //traverse each element of array:
        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //printing the output(max element of an array) to the user:
        System.out.println("the max element is: " + max);
    }
}

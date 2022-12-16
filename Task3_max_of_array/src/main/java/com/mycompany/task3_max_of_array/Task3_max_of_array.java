
package com.mycompany.task3_max_of_array;

import java.util.Scanner;
public class Task3_max_of_array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int num= s.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter your array: ");
        
        for (int i=0; i<num; i++){
            arr[i]= s.nextInt();
        }
        
        int max = arr[0];
        for (int i=0; i<num; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the max element is: "+max);
    }
}

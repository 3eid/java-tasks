//Transpose of Matrix:-

package com.mycompany.task4_transpose;

import java.util.Scanner;
public class Task4_transpose {

    public static void main(String[] args) {
        //geting input matrix dimensions:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Matrix dimensions: ");
        int r = s.nextInt();
        int c = s.nextInt();

        //defining matrix:-
        int[][] arr = new int[r][c];

        //getting matrix form user input:
        System.out.println("Enter your Matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }


        //calculating and printing the transposed matrix
        System.out.println("Transposed Matrix is: \n");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }


    }

}
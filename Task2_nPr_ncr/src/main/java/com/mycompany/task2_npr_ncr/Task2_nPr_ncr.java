// program to calculate nPr and nCr :

package com.mycompany.task2_npr_ncr;
import java.util.Scanner;


public class Task2_nPr_ncr {

    public static void main(String[] args) {
        // ger n and r from user:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n and r :");
        int n = s.nextInt();
        int r = s.nextInt();

        //calculate (by calling npr and ncr methods) and print output.
        System.out.println("nPr = " + npr(n, r) + "\n nCr = " + ncr(n, r));
    }


    // function to calculate factorial    
    public static int fact(int n) {
        //return 1 for fact(0)
        if (n == 0) {
            return 1;
        }


        //calculate fact.
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    //method to calculate nPr
    public static int npr(int n, int r) {
        int res = fact(n) / fact(n - r);
        return res;
    }

    //method to calculate nCr
    public static int ncr(int n, int r) {
        int res = npr(n, r) / fact(r);
        return res;
    }
}
//Quick sort Algorithm:

package com.mycompany.task7_quicksort;
import java.util.Scanner;

public class Task7_quickSort {

    public static void main(String[] args) {
        System.out.println("quickSort Algorithm:");

        //getting array size from user:
        System.out.println("Enter your array size:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        //defining array with  the user input size:
        int[] arr = new int[size];

        //getting unsorted array from user:
        System.out.println("Enter your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        //printing unsorted array:
        System.out.println("Before sorting:");
        printArr(arr, size);

        //applying quick sort to array:
        quickSort(arr, 0, arr.length - 1);

        //printing sortedd array:
        System.out.println("After sorting:");
        printArr(arr, size);
    }

    //method to perform quick sort to an array
    //inputs:- array , range to be sorted starting from:lowIndex to highIndex
    //output:- array sorted with the given range:
    //no return
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        //check if zero element or one element array (already sorted) to exit method:
        if (lowIndex >= highIndex) {
            return;
        }

        //setting pivot with highst index element:- 
        int pivot = arr[highIndex];

        //definig two pointers left and right:
        //initialize them with low and high indexes:
        int lp = lowIndex;
        int rp = highIndex;

        //while the two pointers not pointing to the same element:
        while (lp < rp) {
            //nested loops:

            //while the element lefr pointer pointing to is less than or equal the pivot:
            //make left pointer point to the next element:
            while (arr[lp] <= pivot && lp < rp) {
                lp++;
            }

            //while the element right pointer pointing to is more than or equal the pivot:
            //make right pointer point to the previous element:
            while (arr[rp] >= pivot && lp < rp) {
                rp--;
            }

            //swap the elements the pointers pointing to:
            swap(arr, lp, rp);
        }
        //here both pointers are pointing to the same element
        //swaping this element with the pivot:
        swap(arr, lp, highIndex);
        //here pivot is in the middle
        //all lower elements than it are in its right
        //all higher elements than it are in its left


        //recursion by:-

        //quick sort the elemnt right to the pivot:
        quickSort(arr, lowIndex, lp - 1);

        //quick sort the elemnt left to the pivot:
        quickSort(arr, lp + 1, highIndex);
    }


    //method to swap to elements for an array
    //inputs:- array  ,, index1 ,, index 2
    //no return
    //output:-  swaping element of indx1 with element of index2:
    public static void swap(int[] arr, int indx1, int indx2) {
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }


    // method that print an array:
    //no return
    //inputs: array  ,,  array size
    //output: printing array to user:
    public static void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print((arr[i]) + " ");
        }
        System.out.println(" ");
    }
}
package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInputSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you want to take: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){

            arr[i] = sc.nextInt();
        }
        sortArray(arr);
    }
    public static void sortArray (int[]arr){
        Arrays.sort(arr);
        System.out.printf("Sorted array = %s", Arrays.toString(arr));
    }
}
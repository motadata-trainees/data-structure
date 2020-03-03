package com.motadata.java;

import java.util.Scanner;

public class Peak {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        int[] arr = new int[n1];
        for (int i=0 ; i < n1 ; i++)
        {
                arr[i] = s.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int i=1 ; i < n1 ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.print("peak element is : " + max + " found at index " + index);
    }

}

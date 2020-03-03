package com.motadata.java;

import java.util.Scanner;

public class Market {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        int[] arr = new int[n1];
        for( int i = 0;i < n1; i++)
        {
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int current_diff = 0,diff = 0;

        for (int i = 0;i<arr.length;i++)
        {
            current_diff = arr[i] - min;
            if(current_diff > diff)
                diff = current_diff;
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max profit is : " + diff);

    }
}

package com.motadata.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        int[] arr = new int[n1];
        for (int i=0 ; i < n1 ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("enter value : ");
        int value = s.nextInt();
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();

        for (int i = 0; i < n1; i++)
        {
            for (int j = i; j < n1; j++)
            {
                for (int k = j; k < n1; k++)
                {
                    if (i != j && j != k && i != k && (arr[i] + arr[j] + arr[k] == value))
                    {
                            List<Integer> inner_List = new ArrayList<Integer>(3);
                            inner_List.add(arr[i]);
                            inner_List.add(arr[j]);
                            inner_List.add(arr[k]);
                            my_List.add(inner_List);
                    }
                }
            }
        }
        System.out.println(my_List);

    }
}



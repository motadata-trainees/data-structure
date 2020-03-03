package com.motadata.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Longest {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        List<Integer> l = new ArrayList<>();
        int length = 0;
        for(int i = 0;i < n1;i++)
        {
            int n2 = s.nextInt();
            l.add(n2);
        }
        for (int i = 0;i < n1;i++)
        {
            int temp = l.get(i);
            while(l.contains(temp))
                temp++;
            if(length < temp - l.get(i))
                length = temp - l.get(i);

        }
        System.out.println("length is : " + length);
    }
}

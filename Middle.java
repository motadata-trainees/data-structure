package com.motadata.java;

import java.util.LinkedList;
import java.util.Scanner;

public class Middle {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        for(int i = 0;i < n1;i++)
        {
            int n2 = s.nextInt();
            l.add(n2);
        }
        if (n1%2 == 0)
            System.out.print("middle element is : " + l.get((n1/2)-1));
        else
            System.out.print("middle element is : " + l.get(n1/2));
    }
}

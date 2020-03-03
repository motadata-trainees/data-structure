package com.motadata.java;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        int flag = 0;
        for(int i = 0;i < n1;i++)
        {
            int n2 = s.nextInt();
            l.add(n2);
        }
        int n = n1 -1;
        for(int i = 0 ; i < (n1/2);i++)
        {
            if(l.get(n) == l.get(i)) {
                n--;
                flag = 1;
            }
            else
                break;
        }
        if (flag ==1)
            System.out.println("Palindrome");
        else
            System.out.println("not a Palindrome");

        }
}


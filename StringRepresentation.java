package com.motadata.java;

import java.util.PriorityQueue;
import java.util.Scanner;

public class StringRepresentation {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        PriorityQueue<String> q = new PriorityQueue<>();
        String s3 = "";
        for(int i = 0;i < n1;i++)
        {
            String s1 = s.next();
            q.add(s1);
        }
        System.out.println("Priority Queue : " + q);
        for(int i = 0;i < n1;i++)                                 /* String str1;
                                                                     str1 = q.toString();
                                                                     System.out.println("String representation of the Priority Queue: "+str1);     */
        {

            String s2 = q.poll();
            s3 = s3 +" " + s2 ;
        }
        System.out.println("String Representation : "+s3);



    }
}

package com.motadata.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Tree
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the total number of key and value pairs u want to store  : ");
        int n1 = s.nextInt();
        TreeMap<Integer,String> t = new TreeMap<Integer,String>();
        for (int i = 0;i < n1 ;i++)
        {
            int n2 = s.nextInt();
            String s1 = s.next();
            t.put(n2,s1);

        }
        for(Map.Entry<Integer,String> e:t.entrySet())
        {
            System.out.println(e.getKey()+ " : "+e.getValue());
        }



    }


}

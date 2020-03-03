package com.motadata.java;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Missing {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n1 = s.nextInt();
        List<Integer> l = new ArrayList<>();
        for( int i = 0;i < n1; i++) {
            int n = s.nextInt();
            l.add(n);
        }
        for (int i = 1;i <=n1;i++)
        {
            if(l.contains(i))
                continue;
            else
                System.out.println("missing numbers : " + i);
            /*for (int j = 0;j < n1;j++)
            {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
                flag = 0;
            }
            if (flag == 0)
                System.out.println("missing number : " + i);*/

        }
    }

}

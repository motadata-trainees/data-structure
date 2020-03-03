package com.motadata.java;
import java.util.*;

public class Reverse {
    String s1;
    Reverse(String s1)
    {
        this.s1 = s1;
    }

    String reverse() {
        int len = s1.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < len; i++) {
            st.push(s1.charAt(i));
        }
        s1 = "";
        for (int j = len - 1; j >= 0 ; j--) {
            char pop= st.pop();
            s1 = s1 + pop ;

        }
        return s1;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter string : ");
        String s1 = s.nextLine();
        Reverse ob1 = new Reverse(s1);
        String reverse =  ob1.reverse();
        System.out.print("reversed string : " + reverse);

    }
}
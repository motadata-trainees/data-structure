import java.util.*;
import java.io.*;
//Reverse string using stack
public class StrngRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> st=new Stack<>();

        String str=sc.nextLine();

        for(int i=0;i< str.length();i++)
        {
            st.push(str.charAt(i));
        }
        String str2="";
        while(st.size()!=0) {
            System.out.print(str2 + Character.toString(st.pop()));
        }
    }
}

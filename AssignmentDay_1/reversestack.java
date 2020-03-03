package AssignmentDay1;

import java.util.Stack;

/**
 * Created by parth on 13/2/20.
 */
public class reversestack {
    public static void main(String[] args) {
        Stack<String> st=new Stack<String>();

        String s="helloWorld";
        String[] c=s.split("");
        String reverse="";
        for(int i=0;i<s.length();i++)
        {
            st.push(c[i]);
        }
        for(int i=0;i<s.length();i++)
        {
            reverse=reverse+st.pop();
        }
        System.out.println(reverse);
    }
}

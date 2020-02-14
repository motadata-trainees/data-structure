
//Input Format. There are two strings in the input: the pattern P and the text T .
//Output Format. Print all the positions of the occurrences of P in T in the ascending order. Use 0-based indexing of positions in the the text T .

import java.lang.*;
import java.util.HashMap;
import java.util.Scanner;

public class PatternMatch {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Text: ");
        String str = sc.nextLine();
        System.out.println("Enter the pattern");
        String str1=sc.nextLine();
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        int f=0;
        int e=str1.length();
        while(e<=str.length())
        {
            h.put(f,str.substring(f,e));
            if((h.get(f)).equals(str1))
                System.out.println(f);
            f=f+1;
            e=e+1;
        }
    }
}

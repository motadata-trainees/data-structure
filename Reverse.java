import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> s=new Stack<Character>();
        System.out.println("Enter the string: ");
        String s1=sc.nextLine();
        int n=s1.length();
        for(int i=0;i<n;i++)
            s.push(s1.charAt(i));
        s1="";
        for(int i=0;i<n;i++)
             s1+=s.pop();
        System.out.println("Reverse of string is: \n"+s1);
    }
}


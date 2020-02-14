import java.util.*;
public class Assignment1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        System.out.println("The String is "+s);
        Stack<Character> str=new Stack<Character>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char x=s.charAt(i);
            str.push(x);
        }
        Iterator it=str.iterator();
        System.out.println("Reverse of string: ");
        while(it.hasNext())
        {
            System.out.print(it.next());
        }
    }
}

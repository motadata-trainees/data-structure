import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int m=n;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            list.add(d);
            n=n/10;
        }
       int d1=0;
        int c=0;
        int i=list.size()-1;
        while((m!=0) && (i>=0))
        {
            d1=m%10;
            if(d1==list.get(i))
                c++;
            m=m/10;
            i--;
        }
        if(c==list.size())
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");

    }
}

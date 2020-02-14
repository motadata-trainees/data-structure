import java.util.PriorityQueue;
import java.util.Scanner;

public class Day2a4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Elements you want to enter");
        int n=sc.nextInt();
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            p.add(a);
        }
        String st="";
       for(int i=0;i<n;i++)
       {
           st=st+ p.poll().toString();
       }
        System.out.println("The String is "+st);
       }

}

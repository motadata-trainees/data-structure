package AssignmentDay2;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by parth on 14/2/20.
 */
public class prioritytostring {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of input:");
        int totalinput=Integer.parseInt(sc.nextLine());

        for (int i=0;i<totalinput;i++)
        {
            p.add(sc.nextInt());
        }
        String s="";
        for (int i=0;i<totalinput;i++)
        {
            s=s+ p.poll().toString();
        }

        System.out.println(s);
    }
}

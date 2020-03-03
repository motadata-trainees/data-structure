package AssignmentDay1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by parth on 13/2/20.
 */
public class MiddleLinklist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] list=input.split(" ");
        int k=list.length;
        System.out.println(k);
        int i=0;
        while (k>0)
        {
            int j=Integer.parseInt(list[i]);
            ll.add(j);
            k--;
            i++;
        }
        System.out.println(ll);
        int length=list.length;
        if(length%2==0)
        {
            int l=(length/2)-1;
            System.out.println(ll.get(l));
        }
        else
        {
            int l=length/2;
            System.out.println(ll.get(l));
        }
    }
}

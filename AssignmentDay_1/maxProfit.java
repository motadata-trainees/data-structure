package AssignmentDay1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by parth on 14/2/20.
 */
public class maxProfit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cdiff=0,max=0;
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Enter value ");
        for(int i=0;i<=7;i++)
        {
            int s=sc.nextInt();
            al.add(s);
        }
        int min=al.get(0);
        for(int i=1;i<al.size();i++)
        {
            cdiff=al.get(i)-min;
            if(cdiff>max)
            {  max=cdiff;}
            if(al.get(i)<min)
            {   min=al.get(i);}
        }
        System.out.println("Max profit is "+max);
    }
}

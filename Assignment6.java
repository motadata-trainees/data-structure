import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b,max=0,temp,index=0,t=0;
        ArrayList<Integer> al=new ArrayList<>(7);
        System.out.println("Enter Market value ");
        for(int i=0;i<=7;i++)
        {
            int s=sc.nextInt();
         al.add(s);
        }
        b=al.get(0);
        for(int i=0;i<=7;i++)
        {
            if(al.get(i)<b)
            {
                b=al.get(i);
                t=i;
            }
        }
        System.out.println("Buying price is "+b+" buy on "+" day "+t);
        for(int i=t;i<=7;i++)
        {
            temp=al.get(i);
            if(temp-b>max)
            {
                max=temp;
                index=i;
            }
        }
        System.out.println("Max. Sell price is "+max+" Sell on "+" day "+index);
        System.out.println("Max profit for 1 time buy is "+(max-b));


    }
}

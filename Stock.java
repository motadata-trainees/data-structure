
//Maximum Profit for BUY and SELL Stock Problem For One Transaction
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s= new Stack<Integer>();
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter element separated by space: ");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        s.push(arr.get(0));
        int top=arr.get(0);
        int bottom=arr.get(0);
        int profit=0;
        int m1=0,m2=0;
        for(int i=0;i<arr.size();i++)
        {
            if(s.peek()>arr.get(i))
            {
                s.pop();
                s.push(arr.get(i));
            }
            else if(s.peek()<arr.get(i))
            {
                s.push(arr.get(i));
            }
            bottom=s.firstElement();
            top=s.lastElement();
            if(profit<(top-bottom))
            {    profit=top-bottom;
                 m1=i;
                 m2=bottom;
            }

        }
        System.out.println("Max profit can be gain by buying at "+arr.indexOf(m2)+"th day(0 based indexing) and sell at "+m1+"th day.\n" +
                "Max profit = "+arr.get(m1)+"-"+m2+" = "+profit);
    }
}


//Maximum Profit for BUY and SELL Stock Problem For Multiple Transaction.
//This program will find the maximum profit after doing multiple transaction
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class Stock1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter element separated by space: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        s.push(arr.get(0));
        int top = arr.get(0);
        int bottom = arr.get(0);
        int profit = 0;
        int m1 = 0, m2 = 0;
        for(int i=1;i<arr.size();i++)
        {
            if(s.empty())
            {
                s.push(arr.get(i));
                top=s.peek();
                bottom=s.firstElement();
            }
            if(s.peek()>arr.get(i))
            {
                s.pop();
                profit=profit+top-bottom;
                s.push(arr.get(i));

            }
            else if(s.peek()<arr.get(i))
            {
                s.push(arr.get(i));
                top=s.peek();
                bottom=s.firstElement();
                profit=profit+top-bottom;
                if(profit>0)
                {
                    while(s.isEmpty()==false)
                    {
                        s.pop();
                        top=0;
                        bottom=0;
                    }
                }
            }
        }
        System.out.println("Maximum profit in these case will be : "+profit);

    }
}

import java.util.ArrayList;
import java.util.Scanner;
//Maximum Profit for BUY and SELL Stock Problem For One Transaction
public class StockWithoutStack {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integers separated by space: ");
        String s=sc.nextLine();
        String[] arrOfStr = s.split(" ");
        for(int i=0;i<arrOfStr.length;i++)
            list.add(Integer.parseInt(arrOfStr[i]));

        int min=Integer.MAX_VALUE;
        int max=0;
        int c1=0,c2=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min) {
                min = list.get(i);
            }
            else if(list.get(i)-min>max)
            {   max=list.get(i)-min;
                c2=i;
                c1=list.indexOf(min);
            }
        }
        System.out.println("Max profit can be gain by buying at "+c1+"th day(0 based indexing) and sell at "+c2+"th day.\n" +
                "Max profit = "+list.get(c2)+"-"+list.get(c1)+" = "+max);

    }
}

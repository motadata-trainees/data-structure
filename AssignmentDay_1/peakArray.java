package AssignmentDay1;

import java.util.Scanner;

/**
 * Created by parth on 13/2/20.
 */
public class peakArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array=input.split(" ");
        int peack = 0;
        for (int i=0;i<array.length-1;i++)
        {
            int j=Integer.parseInt(array[i]);
            int k=Integer.parseInt(array[i+1]);
            if(j>k)
            {
                peack=j;
            }
            else 
            {
                peack=k;
            }
        }
        System.out.println("peak:"+peack);

    }
}

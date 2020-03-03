package AssignmentDay1;

import java.util.*;

/**
 * Created by parth on 14/2/20.
 */
public class missingvalue {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Elements");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> list2 = new ArrayList<>();
        for(int text:a) {
            list2.add(text);
        }
        int min=0;
        for(int i=0;i<n-1;i++)
        {
            if (a[i] > a[i+1])
            {
                min=a[i+1];
            }
            else
            {
                min=a[i];
            }
        }
        for (int i=0;i<n;i++)
        {
            if(list2.contains(min))
            {
                min=list2.get(i)+1;
            }
            else
            {
                System.out.println(list2.get(i)-1);
                break;
            }

        }
    }
}

package AssignmentDay2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by parth on 14/2/20.
 */
public class triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of input:");
        int totalinput=Integer.parseInt(sc.nextLine());
        System.out.println("enter sum:");
        int sum=Integer.parseInt(sc.nextLine());
        int a[]=new int[totalinput];
        HashSet<Integer>  obj=new HashSet<>();
        int count=1;
        for (int i=0;i<totalinput;i++)
        {
            obj.add(sc.nextInt());
        }
        Object[] abc=obj.toArray();
        for (int i=0;i<abc.length;i++)
        {
            a[i]=Integer.parseInt(abc[i].toString());
        }
        for(int i=0;i<obj.size()-2;i++)
        {
            for (int j=i+1;j<obj.size()-1;j++)
            {
                for (int k=j+1;k<obj.size();k++)
                {
                    if(sum==a[i]+a[j]+a[k])
                    {
                        System.out.println("triplet "+count+": "+a[i]+" "+a[j]+" "+a[k]);
                        count++;
                    }
                }

            }
        }

    }
}

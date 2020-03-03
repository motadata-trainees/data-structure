package AssignmentDay2;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by parth on 14/2/20.
 */
public class treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> obj=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of input:");
        int totalinput=Integer.parseInt(sc.nextLine());
        for (int i=0;i<totalinput;i++)
        {
            String a=sc.nextLine();
            String[] arr=a.split(" ");
            String a1=arr[0];
            int a2=Integer.parseInt(arr[1]);
            obj.put(a1,a2);
        }
        System.out.println(obj);
    }
}

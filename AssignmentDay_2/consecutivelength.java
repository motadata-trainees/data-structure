package AssignmentDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by parth on 14/2/20.
 */
public class consecutivelength {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Elements");
        n=sc.nextInt();
        int length=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> list2 = new ArrayList<>();
        for(int text:a) {
            list2.add(text);
        }
        for(int i=0;i<n;i++)
        {
                int j = a[i];
                while (list2.contains(j))
                    j++;
                if (length<j-a[i])
                    length = j-a[i];
        }
        System.out.println(length);
    }
}

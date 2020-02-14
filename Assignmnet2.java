import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignmnet2 {
    public static void main(String args[])
    {

        List<String> list=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st[]=new String[n];
        for(int i=0;i<n;i++)
        {
            st[i]=sc.next();
            list.add(st[i]);
        }
        System.out.println(list.get(n/2));

    }
}

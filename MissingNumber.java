import java.util.*;
class MissingNumber {

    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total=total- a[i];
        return total;
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Elements");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int miss = getMissingNo(a, n);
        System.out.println(miss);
    }
}
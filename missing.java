import java.util.*;
public class missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int m=sc.nextInt();
        int a[]=new int[m];
        int add=0;

        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
            add=add+a[i];
        }

//        Check if numbers form  a series and write your code accordingly
//        in this case natural numbers.

        int sum=(m+1)*(m+2)/2;

        int misssingNumber=sum-add;
        System.out.println(misssingNumber);


    }
}

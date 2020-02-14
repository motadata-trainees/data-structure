import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of elements you have:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements separated by space:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int n1=arr.length+1;
        int sum1=(n1*(n1+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Element you are looking for is: "+(sum1-sum));
    }
}

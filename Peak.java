import java.util.Scanner;

public class Peak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements separated by space :");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max=arr[0];
        int c=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
                c=i;
            }
        }
        System.out.println("Maximum element is "+max+" at position(1 based indexing) "+(c+1));
    }
}

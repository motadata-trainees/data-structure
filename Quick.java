import java.util.Scanner;

public class Quick {
   static int partition(int A[], int si, int ei)
    {
        int x = A[ei];
        int i = (si - 1);
        int j;

        for (j = si; j <= ei - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[ei];
        A[ei] = temp;
        return (i + 1);
    }
   static void quickSort(int A[], int start, int end)
    {
        int pindex;
        if (start < end) {
            pindex = partition(A, start, end);
            quickSort(A, start, pindex - 1);
            quickSort(A, pindex + 1, end);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements one by one: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int e = arr.length-1;
        int s=0;
       quickSort(arr,s,e);
        System.out.println("Elements after sorted: ");
       for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");


    }
}

import java.util.*;
import java.io.*;

class Assignment3 {

    static int binarySearch(int arr[], int low, int high, int n) {

        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 ||
                arr[mid + 1] <= arr[mid]))
            return mid;

        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return binarySearch(arr, low, (mid - 1), n);


        else return binarySearch(arr, (mid + 1), high, n);
    }


    static int findPeak(int arr[], int n) {
        return binarySearch(arr, 0, n - 1, n);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
        n= arr.length;
        int index=findPeak(arr, n);
        int value=arr[index];
        System.out.println("Peak element is " +value+" found at index"+index);
    }
}
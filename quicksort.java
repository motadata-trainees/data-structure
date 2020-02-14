import java.util.*;
class quicksort
{
    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        {
            if (arr[j] < pivot) 
            { 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    static void qsort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high);
            qsort(arr, low, pi-1); 
            qsort(arr, pi+1, high); 
        } 
    } 
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter array elements seperated by space");
        s = sc.nextLine();
        String [] str = s.split(" ");
        n= str.length;
        int [] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        qsort(arr,0,n-1);
        sc.close();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
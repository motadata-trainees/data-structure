import java.util.*;
class stocksingle
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter array elements seperated by space");
        s = sc.nextLine();
        System.out.println("Output on basis of 1 base Indexing");
        String [] str = s.split(" ");
        n= str.length;
        int [] arr =new int[n];
        int buy=0;
        int sell=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        int cdiff=0,diff=0,min=arr[0];
        for(int i=0;i<n;i++)
        {
            cdiff=arr[i]-min;
            if(cdiff>diff)
            {
            diff=cdiff;
            sell = i;
            }
            if(arr[i]<min)
            {
            min=arr[i];
            buy=i;
            }
        }
        System.out.println("Stock is  bought on day "+(buy+1)+" sold on day "+(sell+1)+" with profit of "+(diff));
    }
}        
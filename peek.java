import java.util.*;
class peek
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter array elements seperated by space");
        s = sc.nextLine();
        String [] str = s.split(" ");
        n= str.length;
        int sum = 0;
        int [] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        int max =0,maxi=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxi = i;
            }
        }
        System.out.println("Maximum element is at index: "+maxi);


    }
}

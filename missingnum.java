import java.util.*;
class missingnum
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
        for(int i=0;i<n-1;i++)
        {
            sum =sum+ Integer.valueOf(str[i]);
        }
        int missingnumber = (((n+1)*(n))/2 - sum);
        System.out.println("Missing number is : "+missingnumber);
        
    }
}

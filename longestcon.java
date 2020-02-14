import java.util.*;
class longestcon
{
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
        Arrays.sort(arr);
        int start=0;
        int end=0;
        int currstart=0;
        int currend=0;
        int len= 1;
        int currlen=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]==1)
            {
                currlen =currlen+1;
                currend=currend+1;
            }
            else{
                if(currlen>len)
                {
                    start=currstart;
                    len=currlen;
                    end=currend;
                }
                currstart=i;
                currlen=1;   
            }
        }
        if(currlen>len)
                {
                    start=currstart;
                    len=currlen;
                    end=currend;
                }
        //System.out.println(len);
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[start+i]+" ");
        }
        System.out.println();
        sc.close();
            
    }
}
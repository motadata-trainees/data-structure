import java.util.*;
class triplet
{
    static ArrayList <String> ar = new ArrayList<>();
    static void comb(int arr[], int data[], int start, 
                                int end, int index, int r,int sum) 
    { 
        if (index == r) 
        { 
            int tot=0;
            String str = "";
            for (int j=0; j<r; j++)
            {
                tot=tot+data[j];
                
            }
            
            if(sum==tot)
            {
            for (int j=0; j<r; j++)
            {
                str = str + Integer.toString(data[j])+" ";
            }
            if(!ar.contains(str))
                {
                ar.add(str);
                System.out.println(str);
                }
        }
            return; 
        } 
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            comb(arr, data, i+1, end, index+1, r,sum); 
        } 
    } 
    static void print(int arr[], int n, int r,int sum) 
    { 
        int data[]=new int[r]; 
        comb(arr, data, 0, n-1, 0, r,sum); 
    } 
    public static void main(String[] args)
    {
        int n,sum;
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter array elements seperated by space");
        s = sc.nextLine();
        System.out.println("Enter sum");
        sum = sc.nextInt();
        String [] str = s.split(" ");
        n= str.length;
        int [] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        print(arr,n,3,sum);
        sc.close();
            
    }
}
import java.util.*;
class stockmultiple
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
        Stack <Integer> st =new Stack<>();
        int buy=0;
        int sell=0;
        int profit=0;
        int top=0;int bottom=0;
        int count =0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        st.push(arr[0]);
        for(int i=1;i<n;i++)
        {
            if(st.peek()>arr[i])
            {
                top = st.peek();
                count=0;
                while(!st.isEmpty())
                {
                    bottom=st.peek();
                    st.pop();
                    count=count+1;
                }
                profit=profit+top-bottom;
                //System.out.println(i+" "+count);
                System.out.println("Stock bought on day "+(i-(count-1))+" and sold on day "+(i)+" with profit "+(top-bottom));
            }
            st.push(arr[i]);
            //System.out.println();
        }
        top=st.peek();
        count=0;
        //System.out.println(top);
        while(!st.isEmpty())
        {
            bottom=st.peek();
            st.pop();
            count=count+1;
        }
        //System.out.println(bottom);
        profit=profit+top-bottom;
        System.out.println("Stock bought on day "+(n+1-count)+" and sold on day "+(n)+" with profit "+(top-bottom));
        System.out.println("Total profit is : "+profit);
    }
}        
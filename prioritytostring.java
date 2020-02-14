import java.util.*;
class prioritytostring
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
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
        {
            pQueue.add(arr[i]);
        }
        //System.out.println(pQueue.peek()); 
        //System.out.println(pQueue.poll());
        String s1="";
        while(!pQueue.isEmpty())
        {
            s1=s1+Integer.toString(pQueue.poll());
        }
        System.out.println(s1);
        sc.close();
    }
}
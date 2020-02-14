import java.util.*;
class treemap
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        String s,s1;
        System.out.println("Enter array key seperated by space");
        s = sc.nextLine();
        System.out.println("Enter array value seperated by space");
        s1 = sc.nextLine();
        String [] str = s.split(" ");
        n= str.length;
        int [] arr =new int[n];
        String [] arr1 = new String[n];
        String [] str1 = s1.split(" ");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=(str1[i]);
        }
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
  
        for(int i=0;i<n;i++ )
        {
            tree_map.put(arr[i], arr1[i]); 
        }
        System.out.println("TreeMap: " + tree_map); 
        sc.close();      
    }
}
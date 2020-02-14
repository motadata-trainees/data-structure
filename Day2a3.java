import java.util.*;
public class Day2a3 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        System.out.println("How many Elements you want to enter");
      int n=sc.nextInt();
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
      for(int i=0;i<n;i++ )
      {
          System.out.println("Enter key[ "+i+" ]in integer");
          int t=sc.nextInt();
          System.out.println("Enter Value[ "+i+" ]in String");
          String s=sc.next();
          tree_map.put(t,s);
      }

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}

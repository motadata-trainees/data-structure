import java.util.*;
class Assignment4
{
    public static void main(String args[])
    {
        List<String> list=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int n=sc.nextInt();
       String st[]=new String[n];
       for(int i=0;i<n;i++)
       {
           st[i]=sc.next();
           list.add(st[i]);
       }

           for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
           {


                if(list.get(i).equals(list.get(j))) {
                    flag = true;
                }
           }

       if(flag)
       {
           System.out.println("Palindrome");
       }
        else
       {
           Collections.reverse(list);
           System.out.println(list);
       }
    }
}
import java.util.*;
class midlinkcollection
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> list = new LinkedList<>();
        System.out.println("Enter number of nodes you want to enter");
        int n=sc.nextInt();
        System.out.println("Enter node value");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        n=n/2;
        System.out.println("Middle Node is");
        System.out.println(list.get(n));

    }
}
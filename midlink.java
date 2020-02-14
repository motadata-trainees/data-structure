import java.util.*;
class midlink
{
    static Node head;
    static class Node
    {
        int val;
        Node next;
        Node(int n)
        {
            val =n;
            next = null;

        }
    }
    public static void main(String args[])
    {
        midlink l = new midlink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes you want to enter");
        int count = sc.nextInt();
        Node [] node = new Node[count];
        System.out.println("Enter node value");
        head = new Node(sc.nextInt());
        node[1]=new Node(sc.nextInt());
        head.next=node[0];
        for(int i=2;i<count;i++)
        {
            node[i]=new Node(sc.nextInt());
            node[i-1].next =node[i];
        }
        count = count/2;
        System.out.println("Middle node is");
        System.out.println(node[count].val);
    }
}
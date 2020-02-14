import java.util.*;
class palinderome
{
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
    static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String args[])
    {
        midlink l = new midlink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes you want to enter");
        int count = sc.nextInt();
        Node [] node = new Node[count];
        System.out.println("Enter node value");
        node[0]=new Node(sc.nextInt());
        for(int i=1;i<count;i++)
        {
            node[i]=new Node(sc.nextInt());
            node[i-1].next =node[i];
        }
        String s="";
        for(int i =0;i<count;i++)
        s=s+node[i].val;
        System.out.println("Is linked list palindrome ?");
        System.out.println(isPalindrome(s));
    }
}
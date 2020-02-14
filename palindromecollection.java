import java.util.*;
class palindromecollection
{
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
        Scanner sc = new Scanner(System.in);
        LinkedList <String> list = new LinkedList<>();
        System.out.println("Enter number of nodes you want to enter");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextLine());
        }
        String s="";
        for(int i =0;i<n;i++)
        s=s+list.get(i);
        System.out.println("Is linked list palindrome ?");
        System.out.println(isPalindrome(s));
    }
}
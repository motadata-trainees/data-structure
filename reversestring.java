import java.util.*;
class reversestring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack <String> st = new Stack<>();
        String str,revstr;
        revstr = "";
        str=sc.nextLine();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            st.push(str.substring(i,i+1));
        }
        while(!st.isEmpty())
        {
            revstr=revstr+st.peek();
            st.pop();
        }
        System.out.println(revstr);
    }
}
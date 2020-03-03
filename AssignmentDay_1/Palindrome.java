package AssignmentDay1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by parth on 14/2/20.
 */
public class Palindrome {
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int k = list.length;
        int i = 0;
        int flag=0;
        while (k > 0)
        {
            String j = list[i];
            ll.add(j);
            k--;
            i++;
        }

        for(int l=0,j=ll.size()-1;l<ll.size()/2;l++,j--)
        {
            if(ll.get(l).equals(ll.get(j))) {
                flag = 1;
            }
        }
        if(flag==1)
        {
            System.out.println("palindrome");
        }
        if(flag==0)
        {
            System.out.println("not palindrome");
        }

    }

}

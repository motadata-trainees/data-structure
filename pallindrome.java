import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> lt=new LinkedList<>();
        System.out.println("Enter number of elements in the list");
        int m=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++)
        {
            lt.add(sc.nextLine());
        }


//        Processing
        String str="";
        String str1="";
        for(int i=0;i<lt.size();i++){
            str1=str1+lt.get(i);
        }
        for(int j=lt.size()-1;j>=0;j--)
        {
            str=str+lt.get(j);
        }

        if(str.equals(str1)){
            System.out.println("The list is pallindrome");
        }
        else{
            System.out.println("The list is not pallindrome");
        }


    }
}

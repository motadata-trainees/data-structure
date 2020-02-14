import java.util.Scanner;
import java.util.TreeMap;

public class TreeM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,String> tm=new TreeMap<>();
        System.out.println("Enter the number of key value pairs you want to add to your tree:");
        int n=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter key value pair as a string separated by a space: ");
        for(int i=0;i<n;i++){

            String str=sc.nextLine();
            String [] str1=str.trim().split(" ");

            tm.put(Integer.parseInt(str1[0]),str1[1]);
        }
        System.out.println(tm);

    }
}

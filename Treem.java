import java.util.Scanner;
import java.util.TreeMap;

public class Treem {
    public static void main(String[] args) {
        TreeMap<Integer,String> t= new TreeMap<Integer,String>();
        System.out.println("Enter the number of pairs: ");
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Enter each pair in separate line separated by space: ");
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            String[] arrOfStr = s.split(" ");
            t.put(Integer.parseInt(arrOfStr[0]),arrOfStr[1]);
        }
        System.out.println(t);
    }
}

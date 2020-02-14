import java.util.PriorityQueue;
import java.util.Scanner;

public class Pqueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<String> queue=new PriorityQueue<String>();
        System.out.println("Enter input , if integers then enter them separated by space: ");
        String s = sc.nextLine();
        String[] arrOfStr = s.split(" ");
        int n=arrOfStr.length;
        for(int i=0;i<n;i++)
        {
            queue.add(arrOfStr[i]);
        }
        String s1="";
        while(!queue.isEmpty())
            s1=s1.concat(queue.remove());
        System.out.println("String is: "+s1);

    }
}

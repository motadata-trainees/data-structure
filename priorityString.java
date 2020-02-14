import java.util.*;
public class priorityString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int m=sc.nextInt();
        sc.nextLine();
        PriorityQueue<String> pq=new PriorityQueue<>();
        System.out.println("Enter strings to add to queue");
        for(int i=0;i<m;i++)
        {
            pq.add(sc.nextLine());
        }
        System.out.println(pq);
        String str="";
        while(!pq.isEmpty()){
            str=str+pq.remove();
        }
        System.out.println(str);
    }
}

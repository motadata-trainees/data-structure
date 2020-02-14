import java.util.*;
public class Middle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<String> lt=new LinkedList<>();
        System.out.println("Enter the number of Strings");
        int m=s.nextInt();

        s.nextLine();
        System.out.println("Enter the list of strings");


        for(int i=0;i<m;i++){
            lt.add(s.nextLine());
        }
//        for finding the middle element
        int count=0;
        for(int i=0;i<lt.size();i++){
            count++;
        }
        String element=lt.get(count/2);
        System.out.println(element);
    }
}

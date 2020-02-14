import java.util.LinkedList;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements you want in linked list:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        int middle=n/2;
        if(middle%2==0)
            System.out.println("As there are even number of elements, giving out two elements present at middle: "+list.get(middle-1)+" , "+list.get(middle));
        else
            System.out.println("Middle element for odd number of elements: "+list.get(middle));

    }
}


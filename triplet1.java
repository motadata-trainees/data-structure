import java.util.*;

public class triplet1 {
    public static void main(String[] args) {
       // int[] nums = {1, -2, 0, 5, -1, -4};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements separated by space : ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int target = 2;
        for(int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                for (int k = j + 1; k < arr.length; k++)
                    if (arr[i] + arr[j] + arr[k] == target) {
                        HashSet<Integer> triplet=new HashSet<Integer>(3);
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        System.out.println(triplet);
                    }

    }
}
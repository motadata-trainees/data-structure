import java.util.*;
public class sequence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the values");
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }



// sort
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
//        Processing
        int count=0;
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int item:a) {
            list2.add(item);
        }
        for(int i=0;i<m;i++)
        {
            int j = a[i];
            while (list2.contains(j))
                j++;
            if (count<j-a[i])
                count = j-a[i];
        }
        System.out.println("The length of the largest consecutive sequence is: "+count);
        }

    }


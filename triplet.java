import java.util.*;
public class triplet {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int m=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the targeted value");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }


//        processing
// sort
       int temp=0;
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
           }
       }

//     triplets
        ArrayList<Integer[]> arr=new ArrayList<Integer[]>();
        int sum=0;
        for(int i=0;i<m;i++) {
            for (int j = i + 1; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (a[i] <= a[j] && a[j] <= a[k]) {
                       sum = a[i] + a[j] + a[k];
                        if (sum == n) {
                            Integer ae[] = {a[i], a[j], a[k]};

                            arr.add(ae);

                        }
                    }
                }
            }
        }
        for(Integer[] item:arr)
        {
            for(int item1:item){
                System.out.println(item1);
            }
        }

    }
}

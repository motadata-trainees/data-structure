import java.util.*;
public class peakElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int m=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
            arr.add(sc.nextInt());
        }


        int max=arr.get(0);

        int maxIndex=0;

        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
                maxIndex=i;
            }

        }
        System.out.println(max+" found at index "+maxIndex);
    }
}

//40 found at index 2
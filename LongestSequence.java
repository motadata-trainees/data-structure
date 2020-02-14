import java.util.*;
public class LongestSequence {

    public static void main (String[] args) throws java.lang.Exception
    {
        int a[]={2,5,6,7,9,10,11,12,13};
        Arrays.sort(a);
        ArrayList<Integer>output = new ArrayList<Integer>();
        ArrayList<Integer>temp = new ArrayList<Integer>();
        int n=a.length;
        for(int i =1; i<n; i++){
            if(a[i-1] + 1 == a[i]){
                temp.add(a[i-1]);
            }
            else{
                temp.add(a[i-1]);
                if(temp.size() > output.size()){
                    output = (ArrayList<Integer>) temp.clone();
                    temp.clear();
                }
            }
            if(i==(n-1))
            {
                if(a[i-1]+1==a[i])
                    temp.add(a[i]);
            }
        }
        System.out.println("Longest Consecutive Element sequence is "+temp+" of length "+temp.size());
    }

}
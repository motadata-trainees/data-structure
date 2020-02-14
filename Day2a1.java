import java.util.*;
public class Day2a1 {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Day2a1 triplet = new Day2a1();
            int count=0;
            HashSet<Integer> h = new HashSet<Integer>();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                h.add(a);
            }
            Object[] o =h.toArray();
            int a[]=new int[o.length];
            for(int i=0;i<o.length;i++)
            {
                a[i]=(int)o[i];
            }
            int sum = 2;
            for (int i = 0; i < h.size() - 2; i++) {

                for (int j = i + 1; j < h.size() - 1; j++) {

                    for (int k = j + 1; k < h.size(); k++) {
                        if (a[i]+ a[j] + a[k] == sum) {
                            count++;
                            System.out.println("Triplet["+count+"] is " + a[i] + ", " + a[j] + ", " + a[k]);

                        }
                    }
                }
            }


        }


    }


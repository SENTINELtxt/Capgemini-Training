package Hierarchical;

import java.util.*;


public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<A.length;i++)
        {
            A[i] = sc.nextInt();
        }
        int count = 0, sum;
        for(int i=0;i<A.length;i++)
        {
            sum = 0;
            for(int j=i;j<A.length;j++)
            {
                sum = A[j] + sum;
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
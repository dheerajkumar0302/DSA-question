package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of packets: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter packets:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no. of students: ");
        int m = sc.nextInt();
        System.out.println(findMinDiff(arr,n,m));
    }

    private static int findMinDiff(int[] a, int n,int m) {
        // your code here
        if(n==0 || m==0)
            return 0;

        if(n<m)
            return -1;
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;

        for(int i=0 ; i+m-1< n ; i++)
        {
            int diff=a[i+m-1]-a[i];
            minDiff=Math.min(minDiff,diff);
        }

        return minDiff;
    }
}

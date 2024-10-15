package com.Array;

import java.util.Scanner;

public class MinimumJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumJumps(arr,n));
    }

    private static int minimumJumps(int[] arr, int n) {

        if(n<=1)
            return 0;
        if(arr[0]==0)
            return -1;

        int jump=0;
        int step=0;
        int maxReach=0;

        for(int i=0 ; i< n ; i++)
        {
            if(i>maxReach)
                return -1;
            maxReach=Math.max(i+arr[i],maxReach);

            if(i==n-1)
                return jump;
            if(step==0)
            {
                jump++;
                step=maxReach-i;
            }
            step--;
        }
        return -1;
    }


}

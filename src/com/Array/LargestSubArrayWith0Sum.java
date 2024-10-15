package com.Array;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestSubarrayWithZeroSum(arr,n));
    }




    // naive approach
//    private static int largestSubarrayWithZeroSum(int[] arr, int n) {
//        int max=0;
//        // Your code here
//        for(int i=0 ; i< n ; i++)
//        {
//            int sum=0;
//            for(int j=i ; j< n ; j++)
//            {
//                sum+=arr[j];
//                if(sum==0)
//                    max=Math.max(max,j-i+1);
//            }
//        }
//        return max;
//    }

    // better approach

    private static int largestSubarrayWithZeroSum(int[] arr, int n) {
        HashMap<Integer,Integer> mpp =  new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0 ; i< n ; i++)
        {
            sum+=arr[i];
            if(sum==0)
                max=Math.max(max,i+1);
            if(mpp.containsKey(sum))
            {
                max=Math.max(max,i-mpp.get(sum));
            }
            else
                mpp.put(sum,i);
        }
        return max;
    }
}

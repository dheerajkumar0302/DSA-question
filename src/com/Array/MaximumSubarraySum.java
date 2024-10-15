package com.Array;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSubarraySum(arr,n));
    }

    //NAIVE APPROACH
//    private static int maximumSubarraySum(int[] arr, int n) {
//
//        int maxSum=Integer.MIN_VALUE;
//        for(int i=0 ; i< n ; i++)
//        {
//            int sum=0 ;
//            for(int j=i ; j<n ; j++)
//            {
//                sum+=arr[j];
//                maxSum=Math.max(sum,maxSum);
//            }
//        }
//        return maxSum;
//    }

    // OPTIMAL APPROACH
    // KADANE'S ALGO
    private static int maximumSubarraySum(int[] arr , int n)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<n; i++)
        {
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}

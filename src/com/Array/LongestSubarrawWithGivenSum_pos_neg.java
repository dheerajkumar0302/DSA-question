package com.Array;

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubarrawWithGivenSum_pos_neg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int k = sc.nextInt();
        System.out.println("Longest subarray with given sum is : " + longestSubarrayWithGivenSum(arr, n, k));

    }

    private static int longestSubarrayWithGivenSum(int[] a, int n, int k) {

        //    using hashing
    HashMap<Integer,Integer> mpp = new HashMap<>();
    int maxLen=0;
    int sum=0;
    for(int i=0 ; i< n ; i++)
    {
        sum+=a[i];
        // if sum == target store its length
        if(sum==k)
            maxLen=Math.max(maxLen,i+1);

        int rem=sum-k;

        if(mpp.containsKey(rem))
        {
            int len=i-mpp.get(rem);
            maxLen=Math.max(maxLen,len);
        }

        if(!mpp.containsKey(sum))
        {
            mpp.put(sum,i);
        }
    }
    return maxLen;
    }
}

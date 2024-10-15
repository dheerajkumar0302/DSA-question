package com.Array;

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubarrayWithGivenSum_POS {
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




//    brute forced approach
//    using two loop
//    private static int longestSubarrayWithGivenSum(int[] a, int n, int k) {
//
//        int maxLen=0;
//        for(int i=0 ; i<a.length; i++)
//        {
//            int sum=0;
//            for(int j=i ; j<a.length;j++)
//            {
//                sum+=a[j];
//                if(sum==k)
//                    maxLen=Math.max(maxLen , j-i+1);
//            }
//        }
//        return maxLen;
//


//    better approach
//    using hashing
//private static int  longestSubarrayWithGivenSum(int[] a, int n, int k) {
//    HashMap<Integer,Integer> mpp = new HashMap<>();
//    int maxLen=0;
//    int sum=0;
//    for(int i=0 ; i< n ; i++)
//    {
//        sum+=a[i];
//        // if sum == target store its length
//        if(sum==k)
//            maxLen=Math.max(maxLen,i+1);
//
//        int rem=sum-k;
//
//        if(mpp.containsKey(rem))
//        {
//            int len=i-mpp.get(rem);
//            maxLen=Math.max(maxLen,len);
//        }
//
//        if(!mpp.containsKey(sum))
//        {
//            mpp.put(sum,i);
//        }
//    }
//    return maxLen;
//}

//    optimized Approach

    private static int longestSubarrayWithGivenSum(int[] a, int n, int k) {

        int sum=a[0];
        int left=0 ;
        int right=0;
        int maxLen=0;
        while(right<n)
        {
            while(left<=right && sum>k)
            {
                sum-=a[left];
                left++;
            }

            // if sum == target
            if(sum==k)
                maxLen=Math.max(maxLen,right-left+1);

            right++;
            if(right<n)
                sum+=a[right];
        }
        return maxLen;
    }
}

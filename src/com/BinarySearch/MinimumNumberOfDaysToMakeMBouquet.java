package com.BinarySearch;

import java.util.Scanner;

//You are given an integer array bloomDay, an integer m and an integer k.
//
//You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
//
//The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
//
//Return the minimum number of days you need to wait to be able to make m bouquets from the garden.
// If it is impossible to make m bouquets return -1.
//
//
//
//Example 1:
//
//Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
//Output: 3
//Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
//We need 3 bouquets each should contain 1 flower.
//After day 1: [x, _, _, _, _]   // we can only make one bouquet.
//After day 2: [x, _, _, _, x]   // we can only make two bouquets.
//After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
public class MinimumNumberOfDaysToMakeMBouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] bloomDay = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            bloomDay[i]=sc.nextInt();
        }
        System.out.print("Enter no of bouquet: ");
        int m=sc.nextInt();
        System.out.print("Enter no. of adjacent flower: ");
        int k = sc.nextInt();
        System.out.println(minDays(bloomDay,m,k));
    }



    // naive approach
//    private static int minDays(int[] bloomDay, int m, int k) {
//        int low=min(bloomDay);
//        int high = max(bloomDay);
//        for(int i=low ; i<=high ; i++)
//        {
//            if(possible(bloomDay, i, m, k))
//                return i;
//        }
//        return -1;
//    }
//    private static int min(int[] nums )
//    {
//        int min=Integer.MAX_VALUE;
//        for(int i=0 ; i<nums.length; i++)
//        {
//            min=Math.min(min,nums[i]);
//        }
//        return min;
//
//    }
//    private static int max(int[] nums )
//    {
//        int max=Integer.MIN_VALUE;
//        for(int i=0 ; i<nums.length; i++)
//        {
//            max=Math.max(max,nums[i]);
//        }
//        return max;
//    }
//
//    private static boolean possible(int[] bloomDay , int day , int m , int k)
//    {
//        int cnt=0;
//        int bouquet=0;
//        for(int i=0 ; i<bloomDay.length ; i++)
//        {
//            if(bloomDay[i]<=day)
//                cnt++;
//            else
//            {
//                bouquet+=cnt/k;
//                cnt=0;
//            }
//        }
//        bouquet+=cnt/k;
//        return bouquet >= m;
//    }



    // optimized approach
    private static int minDays(int[] bloomDay, int m, int k) {
        // Check if it's possible to create m bouquets with k flowers in total
        if (m * k > bloomDay.length) return -1;
        // Initialize min and max from the bloomDay array
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k))
            {   high=mid-1;
                ans=mid;
            }
            else
                low=mid+1;
        }
        return ans;
    }


    private static boolean possible(int[] bloomDay , int day , int m , int k)
    {
        int cnt=0;
        int bouquet=0;
        for(int i=0 ; i<bloomDay.length ; i++)
        {
            if(bloomDay[i]<=day)
                cnt++;
            else
            {
                bouquet+=cnt/k;
                cnt=0;
            }
        }
        bouquet+=cnt/k;
        return bouquet >= m;
    }
}

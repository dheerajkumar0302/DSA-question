package com.BinarySearch;
//Koko loves to eat bananas.
// There are n piles of bananas, the ith pile has piles[i] bananas.
// The guards have gone and will come back in h hours.
//
//Koko can decide her bananas-per-hour eating speed of k.
// Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//
//Return the minimum integer k such that she can eat all the bananas within h hours.
//
//
//
//Example 1:
//
//Input: piles = [3,6,7,11], h = 8
//Output: 4
import java.util.Scanner;


public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] nums = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter no of hour: ");
        int h=sc.nextInt();
        System.out.println(minimumBanana(nums,h));
    }


    // Naive Approach
//    private static int minimumBanana(int[] nums, int h) {
//        int maxi=max(nums);
//        for(int i=1 ; i <=maxi ; i++)
//        {
//           int reqTime=calculateHours(nums,i);
//           if(reqTime<=h)
//               return i;
//        }
//        return maxi;
//    }
//
    private static int calculateHours(int[] nums, int k) {
        int hour=0;
        for (int num : nums) {
            hour += Math.ceil((double) num / (double) k);
        }
        return hour;
    }
//
    private static int max(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    private static int minimumBanana(int[] nums , int h)
    {
        int low=0;
        int  high = max(nums);
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int hour=calculateHours(nums,mid);
            if(hour<=h)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
}

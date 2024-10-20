package com.BinarySearch;
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.
//
//
//
//Example 1:
//
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
import java.util.Scanner;

public class KtmMissingPositiveNumber {
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
        System.out.print("Enter kth missing: ");
        int k=sc.nextInt();
        System.out.println(findKthPositive(nums,k));
    }


    // brute force
    private static int findKthPositive(int[] arr, int k) {
        for (int j : arr) {
            if (j <= k)
                k++;
            else
                break;

        }
        return k;
    }

    //optimized
//      public int findKthPositive(int[] arr, int k) {
//       int low=0;
//       int high=arr.length-1;
//       while(low<=high)
//       {
//            int mid=low+(high-low)/2;
//            int missing=arr[mid]-(mid+1);
//            if(missing<k)
//                low=mid+1;
//            else
//                high=mid-1;
//       }
//       return (high+1+k);     // missing of arr[high]+more required missing
//    }
}

package com.BinarySearch;

import java.util.Scanner;

public class FindKRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array: ");
        for(int i=0 ; i<n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(findKRotation(nums));
    }

    private static int findKRotation(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // If the array is not rotated (already sorted)
        if (arr[low] <= arr[high]) {
            return low;
        }

        // Binary search to find the minimum element
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the minimum element
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if(arr[mid]>arr[high])
                low=mid+1;
            else
                high=mid-1;
        }

        return low;
    }
}

package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindFloor {
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
        System.out.print("Enter target value:  ");
        int target =sc.nextInt();
        System.out.println(findFloor(nums,target));
    }

    private static int findFloor(int[] nums, int x) {
        Arrays.sort(nums);
        int low = 0 ;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid =low+(high-low)/2;
            if(nums[mid]==x)
                return mid;
            if(nums[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }

        return high;
    }
}

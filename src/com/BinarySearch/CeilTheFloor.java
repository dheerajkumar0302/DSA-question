package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//Given an unsorted array arr[] of integers and an integer x,
// find the floor and ceiling of x in arr[].
//
//Floor of x is the largest element which is smaller than or equal to x.
// Floor of x doesn’t exist if x is smaller than smallest element of arr[].
//Ceil of x is the smallest element which is greater than or equal to x.
// Ceil of x doesn’t exist if x is greater than greatest element of arr[].
//Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
//Output: 6, 8
//Explanation: Floor of 7 is 6 and ceil of 7 is 8.
public class CeilTheFloor {
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
        System.out.println(Arrays.toString(ceilTheFloor(nums, target)));
    }

    private static int[] ceilTheFloor(int[] arr, int x) {
        Arrays.sort(arr);
        int low=0;
        int high = arr.length-1;
        int ceil=-1;
        int floor=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                return new int[]{x,x};
            }
            else if(arr[mid]>x)
            {
                ceil=arr[mid];
                high=mid-1;
            }
            else
            {
                floor=arr[mid];
                low=mid+1;
            }
        }

        return new int[]{floor,ceil};
    }
}




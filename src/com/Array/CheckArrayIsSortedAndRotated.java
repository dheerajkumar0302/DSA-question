package com.Array;

import java.util.Scanner;

public class CheckArrayIsSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i< n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(isSortedRotated(arr,n));
    }

    public static boolean isSortedRotated(int[] nums , int n)
    {
        int count=0;
        for(int i=1 ; i<n ; i++)
        {
            if(nums[i-1]>nums[i])
                count++;
        }
        if(nums[n-1]>nums[0])
            count++;

        if(count>1)
            return false;
        return true;
    }
}

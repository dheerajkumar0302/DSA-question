package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutaion(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutaion(int[] nums, int n) {
        int index=-1;
        for(int i=n-2 ; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }

        if(index==-1)
        {
            reverse(nums,0,n-1);
            return ;
        }

        for(int i=n-1 ; i>=index ; i--)
        {
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        reverse(nums,index+1,n-1);
    }

    static void  reverse(int[] arr , int low , int high)
    {
        while(low<=high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}


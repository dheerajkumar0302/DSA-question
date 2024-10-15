package com.Array;

import java.util.Scanner;

public class TrappingWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(totalTrappedWater(arr,n));
    }


    // naive method
//    private static int totalTrappedWater(int[] arr, int n) {
//        int leftMax[] = new int[n];
//        int rightMax[] = new int[n];
//         leftMax[0]=arr[0];
//         for(int i=1 ; i<n ; i++)
//         {
//             leftMax[i]=Math.max(leftMax[i-1],arr[i]);
//         }
//         rightMax[n-1]=arr[n-1];
//         for(int i=n-2 ; i>=0 ; i--)
//         {
//             rightMax[i]=Math.max(rightMax[i+1],arr[i]);
//         }
//         int water =0;
//         for(int i=0 ; i< n ; i++)
//         {
//             water=water+Math.min(leftMax[i],rightMax[i])-arr[i];
//         }
//         return water;
//
//    }

    // Optimal approach
    private static int totalTrappedWater(int[] arr , int n)
    {
        // 3 0 0 2 0 4
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        int water = 0;
        while(left<=right)
        {
            if(arr[left]<arr[right])
            {
                if(arr[left]>=leftMax)
                    leftMax=arr[left];
                else
                    water+=leftMax-arr[left];

                left++;
            }

            else {
                 if(right>=rightMax)
                        rightMax=arr[right];
                 else
                     water+=rightMax-arr[right];

                 right--;
            }
        }
        return water;
    }
}

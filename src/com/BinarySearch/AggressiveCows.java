package com.BinarySearch;

import java.util.Scanner;

public class AggressiveCows {
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
        System.out.print("Enter cows: ");
        int k=sc.nextInt();
        System.out.println(aggressiveCows(nums,k));
    }

    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        java.util.Arrays.sort(stalls);
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<stalls.length ; i++)
        {
            min=Math.min(min, stalls[i]);
            max=Math.max(max, stalls[i]);
        }

        for(int i=0 ; i<= max-min ; i++)
        {
            if(cowPlaced(stalls,i,k))
                continue;
            else
                return i-1;
        }
        return stalls[stalls.length-1]-stalls[0];
    }

    public static boolean cowPlaced(int[] stalls , int gap , int cows)
    {
        int cntCows=1;
        int lastCows=stalls[0];
        for(int i=0 ; i<stalls.length;i++)
        {
            if(stalls[i]-lastCows>=gap)
            {
                cntCows++;
                lastCows=stalls[i];
            }
        }
        return cntCows>=cows;
    }






    // optimized
//    public static int aggressiveCows(int []stalls, int k) {
//        //    Write your code here.
//        java.util.Arrays.sort(stalls);
//        int min=Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0 ; i<stalls.length ; i++)
//        {
//            min=Math.min(min, stalls[i]);
//            max=Math.max(max, stalls[i]);
//        }
//        int low=1;
//        int high=max-min;
//        while(low<=high)
//        {
//            int mid = low+(high-low)/2;
//            if(cowPlaced(stalls,mid,k))
//               low=mid+1;
//            else
//                high=mid-1;
//        }
//        return high;
//    }
}

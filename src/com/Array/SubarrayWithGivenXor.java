package com.Array;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter xor value: ");
        int target = sc.nextInt();
        System.out.println(subarrayWithGivenXor(arr,target));
        System.out.println(subarrayWithZeroXor(arr,n));
    }



    // naive method
//    private static int subarrayWithGivenXor(int[] arr, int target) {
//        int cnt=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            int xor=0;
//            for(int j = i ; j<arr.length ; j++)
//            {
//                xor^=arr[j];
//                if(xor==target)
//                    cnt++;
//            }
//        }
//        return cnt;
//    }

    // optimal approach
    private static int subarrayWithGivenXor(int[] arr, int target) {
        int cnt=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int xr=0;
        mpp.put(xr,1);
        for (int j : arr) {
            xr ^= j;
            int x = xr ^ target;
            if (mpp.containsKey(x))
                cnt += mpp.get(x);

            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }
    private static int subarrayWithZeroXor(int[] arr, int n) {
        int cnt=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int xr=0;
        mpp.put(xr,1);
        for (int j : arr) {
            xr ^= j;
            if (xr == 0)
                cnt++;
            if (mpp.containsKey(xr))
                cnt += mpp.get(xr);
            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }


}

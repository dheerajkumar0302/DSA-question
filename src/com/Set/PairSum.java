package com.Set;

import java.util.HashSet;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array : ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter sum : ");
        int sum =sc.nextInt();
        System.out.println(pairSum(arr,n,sum));
    }

    private static boolean pairSum(int[] arr, int n, int sum) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0 ; i<n ; i++)
        {
            if(hash.contains(sum-arr[i]))
                return true;
            else
                hash.add(arr[i]);
        }
        return false;
    }
}

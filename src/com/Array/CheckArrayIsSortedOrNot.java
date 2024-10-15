package com.Array;

import java.util.Scanner;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0 ; i< n ;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(isSorted(arr,n));
    }

    static int isSorted(int[] arr , int n )
    {
        for(int i = 1 ; i< n ; i++)
        {
            if(arr[i-1]>arr[i])
                    return 0;
        }
        return 1;
    }
}

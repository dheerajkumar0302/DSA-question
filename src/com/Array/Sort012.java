package com.Array;

import java.util.Arrays;
import java.util.Scanner;



public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString( sort012(arr,n)));
    }




    // naiveMethod
//    private static int[] sort012(int[] arr, int n)
//    {
//        int zero=0,one=0,two=0;
//        for(int i=0 ; i<n ; i++)
//        {
//            if(arr[i]==0)
//                    zero++;
//            else if(arr[i]==1)
//                    one++;
//            else
//                    two++;
//        }
//
//        for(int i=0 ; i<zero;i++)
//        {
//            arr[i]=0;
//        }
//        for(int i=zero;i<zero+one;i++)
//        {
//            arr[i]=1;
//        }
//        for(int i=zero+one ; i<n ; i++)
//        {
//            arr[i]=2;
//        }
//
//        return arr;
//    }

    // better approach
    // dutch national algo
    private static int[] sort012(int[] arr, int n) {
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
                mid++;
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;
    }
    private static void  swap(int[] arr , int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

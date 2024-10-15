package com.Array;

import java.util.Scanner;

public class StockBuyAndSell1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(stockBuyAndSellProfit(arr,n));
    }


    // naive approach
//    private static int stockBuyAndSellProfit(int[] arr, int n) {
//        int temp[] = new int[n];
//        temp[n-1]=arr[n-1];
//        for(int i= n-2 ; i>=0 ; i--)
//        {
//            temp[i]=Math.max(temp[i+1],arr[i]);
//        }
//
//        int maxProfit=0;
//        for(int i=0 ; i< n ; i++)
//        {
//            int profit=temp[i]-arr[i];
//            maxProfit=Math.max(profit,maxProfit);
//        }
//        return maxProfit;
//    }

    // OPTIMAL APPROACH
    private static int stockBuyAndSellProfit(int[] arr , int n)
    {
        int minSoFar=arr[0];
        int maxProfit=0;
        for(int i=0 ; i< n ; i++)
        {
            minSoFar=Math.min(arr[i],minSoFar);
            int profit=arr[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}

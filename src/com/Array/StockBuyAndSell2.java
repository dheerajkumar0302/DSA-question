package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSell2 {
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
        System.out.println(stockBuyAndSellSegemnt(arr,n));
    }

    // one approach
    private static int stockBuyAndSellProfit(int[] arr , int n)
    {
        int profit=0;
        for(int i=0 ; i<n-1 ; i++)
        {
            if(arr[i]<arr[i+1])
                profit+=arr[i+1]-arr[i];
        }
        return profit;
    }

    // Another approach
    private static ArrayList<ArrayList<Integer>> stockBuyAndSellSegemnt(int[] arr , int n)
    {
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        int i=0;
        while(i<n-1)
        {
            while(i<n-1 && arr[i]>arr[i+1])
                    i++;
            int buy=i++;
            if(i==n-1)
                break;
            while(i<n && arr[i]>=arr[i-1])
                    i++;
            int sell=i-1;
            ArrayList<Integer> segment = new ArrayList<>();
            segment.add(buy);
            segment.add(sell);
            ans.add(segment);
        }
        return ans;
    }

}

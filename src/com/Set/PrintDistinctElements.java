package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PrintDistinctElements {
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

        System.out.println(distinctElement(arr,n));
    }

    private static ArrayList<Integer> distinctElement(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i< n ; i++)
        {
            if( !set.contains(arr[i]))
            {
                list.add(arr[i]);

                set.add(arr[i]);
            }
        }

        return list;
    }
}

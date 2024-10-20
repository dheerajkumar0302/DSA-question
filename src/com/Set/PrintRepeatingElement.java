package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PrintRepeatingElement {
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

        System.out.println(repeatingElement(arr,n));
    }

    private static ArrayList<Integer> repeatingElement(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i< n ; i++)
        {
            if(set.contains(arr[i]))
                list.add(arr[i]);
            else
                set.add(arr[i]);
        }
        return  list;
    }
}

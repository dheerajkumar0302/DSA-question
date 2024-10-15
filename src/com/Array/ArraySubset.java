package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a1 = new int[n];
        System.out.println("Enter 1st array:");
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] a2 = new int[n];
        System.out.println("Enter 1st array:");
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println(isSubset(a1,a2,n,m));
    }

    private static String isSubset(int[] a1, int[] a2, int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i< n ; i++)
        {
            arr.add(a1[i]);
        }
        for(int i= 0 ; i<m ; i++)
        {
            if(arr.contains(a2[i]))
                arr.remove(a2[i]);
            else
                return "No";
        }
        return "Yes";
    }
}

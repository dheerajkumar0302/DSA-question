package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

//Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.
//
//
//
//        Example:
//Input: ‘n’ = 5 ‘m’ = 3
//        ‘a’ = [1, 2, 3, 4, 6]
//        ‘b’ = [2, 3, 5]
//
//Output: [1, 2, 3, 4, 5, 6]
public class MergeTwoSortedArray_Pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1  = new int[n];
        System.out.println("Enter first array: ");
        for(int i=0 ; i< n ; i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter second array: ");
        for(int i=0 ; i< m ; i++)
        {
            arr2[i]=sc.nextInt();
        }

        ArrayList<Integer> union = mergeTwoSortedArray(arr1,arr2);
        for(Integer i: union)
        {
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> mergeTwoSortedArray(int[] a , int[] b)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<a.length && j < b.length)
        {
            while(i<a.length-1 && a[i]==a[i+1])
            {
                i++;
            }
            while(j<b.length-1 && b[j]==b[j+1])
            {
                j++;
            }
            if(a[i]<b[j])
            {
                ans.add(a[i]);
                i++;
            }
            else if(b[j]<a[i])
            {
                ans.add(b[j]);
                j++;
            }
            else
            {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length)
        {
            while(i<a.length-1 && a[i]==a[i+1])
            {
                i++;
            }
            ans.add(a[i++]);
        }
        while(j<b.length)
        {
            while(j<b.length-1 && b[j]==b[j+1])
            {
                j++;
            }
            ans.add(b[j++]);
        }
        return ans;
    }
}

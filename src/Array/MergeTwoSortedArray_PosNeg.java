package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Scanner;

public class MergeTwoSortedArray_PosNeg {
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

        ArrayList<Integer> union = mergeTwoSortedArray(arr1,arr2,n,m);
        for(Integer i: union)
        {
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> mergeTwoSortedArray(int[] arr1 , int[] arr2 , int n , int m)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0 ; i< n ; i++)
        {
            set.add(arr1[i]);
        }

        for(int j=0 ; j<m ; j++)
        {
            set.add(arr2[j]);
        }

        ArrayList<Integer> union = new ArrayList<>(set);
        Collections.sort(union);
        return union;
    }

}

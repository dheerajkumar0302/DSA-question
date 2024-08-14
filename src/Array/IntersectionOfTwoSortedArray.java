package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArray {
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

        ArrayList<Integer> intersection =intersectionOfTwoArray(arr1,arr2,n,m);
        for(Integer i: intersection)
        {
            System.out.print(i+" ");
        }
}

    private static ArrayList<Integer> intersectionOfTwoArray(int[] arr1, int[] arr2,int n , int m) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j< m )
        {
            if(arr1[i]<arr2[j])
                i++;
            else if(arr2[j]<arr1[i])
                j++;
            else
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
}

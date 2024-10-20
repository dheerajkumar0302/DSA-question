package com.Sorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        merge(arr1, arr2, n, m);
    }

    public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void merge(int[] arr1, int[] arr2, int n, int m) {

        // len of the imaginary single array:
        int len = n + m;

        // Initial gap:
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            // Place 2 pointers:
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // case 1: left in arr1[]
                //and right in arr2[]:
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // case 2: both pointers in arr2[]:
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                // case 3: both pointers in arr1[]:
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            // break if iteration gap=1 is completed:
            if (gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap / 2) + (gap % 2);
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr1[k] + " ");
        }
        for (int k = 0; k< m; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
//    private static void merge(int[] arr1, int[] arr2, int n, int m) {
//       int left=n-1;
//       int right=0;
//       while(left>=0 && right<m)
//       {
//           if(arr1[left]>=arr2[right])
//           {
//               int temp=arr1[left];
//               arr1[left]=arr2[right];
//               arr2[right]=temp;
//               left--;
//               right++;
//           }
//           else
//               break;
//       }
//       Arrays.sort(arr1);
//       Arrays.sort(arr2);
//        for (int k = 0; k < n; k++) {
//            System.out.print(arr1[k] + " ");
//        }
//        for (int k = 0; k< m; k++) {
//            System.out.print(arr2[k] + " ");
//        }
//
//    }

//    private static void merge(int[] arr1, int[] arr2, int n, int m) {
//        // Create a temporary array to hold elements of both arrays
//        int[] temp = new int[m + n];
//
//        // Copy elements of arr1 into temp
//        int i=0 ;
//        int j=0;
//        int index=0;
//
//        while(i<n && j<m)
//        {
//            if(arr1[i]<=arr2[j])
//            {
//                temp[index++]=arr1[i];
//                i++;
//            }
//            else
//            {
//                temp[index++]=arr2[j];
//                j++;
//            }
//        }
//        while(i<n)
//        {
//            temp[index++]=arr1[i];
//            i++;
//        }
//
//        while (j<m)
//        {
//            temp[index++]=arr2[j];
//            j++;
//        }
////
//
//        for (int k = 0; k < n; k++) {
//            arr1[k]=temp[k];
//        }
//        for (int k = 0; k < m; k++) {
//            arr2[k]=temp[k+n];
//        }
//        // Print both arrays
//        for (int k = 0; k < n; k++) {
//            System.out.print(arr1[k] + " ");
//        }
//        for (int k = 0; k< m; k++) {
//            System.out.print(arr2[k] + " ");
//        }
//    }
//

}
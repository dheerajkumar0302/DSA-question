package Array;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        int k = removeDuplicates(arr);
        System.out.println("Array after removed duplicates: ");
        for(int i =0 ; i< k ; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    static int removeDuplicates(int[] arr)
    {
        int j=0;
        for(int i=0 ; i<arr.length;i++)
        {
            while(i<arr.length-1 && arr[i]==arr[i+1])
            {
                i++;
            }
            arr[j]=arr[i];
            j++;
        }
        return j;
    }

    // another approach
//    static int removeDuplicates(int[] arr) {
//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;
//    }
}

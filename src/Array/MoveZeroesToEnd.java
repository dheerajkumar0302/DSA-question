package Array;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0 ; i< n ;i++)
        {
            arr[i]=sc.nextInt();
        }

        moveZeroes(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] arr , int n)
    {
        int j=0;
        for(int i=0 ; i< n ; i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}

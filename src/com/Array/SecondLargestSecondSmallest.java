package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array");
        for(int i= 0; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] ans;
        Solutions obj = new Solutions();
        ans=obj.secondSmallestAndLargest(arr,n);
        System.out.println(Arrays.toString(ans));
    }
}
class Solutions
{
    public int[] secondSmallestAndLargest(int[] arr, int n)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=largest;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=smallest;

        for(int i=0; i< n ; i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && secondLargest!=largest)
            {
                secondLargest=arr[i];
            }


            if(arr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && secondSmallest!=smallest)
            {
                secondSmallest=arr[i];
            }
        }
        return new int[]{secondSmallest, secondLargest};
    }
}

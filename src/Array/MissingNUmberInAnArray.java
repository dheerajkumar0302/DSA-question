package Array;

import java.util.Scanner;

public class MissingNUmberInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing number: "+missingNumber(arr , n));
    }
    static int missingNumber(int[] nums , int n)
    {
        int overallSum=n*(n+1)/2;
        int sum=0;
        for(int i=0 ; i<n ; i++)
        {
            sum+=nums[i];
        }

        return overallSum-sum;
    }
}

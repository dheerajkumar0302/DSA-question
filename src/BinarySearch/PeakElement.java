package BinarySearch;

import java.util.Scanner;
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array: ");
        for(int i=0 ; i<n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(peakElementIndex(nums,n));
    }

    private static int peakElementIndex(int[] nums, int n) {
        int low=0 ;
        int high=n-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1])
                high=mid;               // peak must be in left part including mid
            else
                low=mid+1;
        }

        return low;
    }
}

package BinarySearch;

import java.util.Scanner;

public class MinimumInRotatedSortedArray {
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
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // If the array is not rotated (already sorted)
        if (arr[low] <= arr[high]) {
            return arr[low];
        }

        // Binary search to find the minimum element
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the minimum element
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // Check if mid+1 is the minimum element
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            // If the left half is sorted, the minimum must be in the right half
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                // Otherwise, the minimum is in the left half
                high = mid - 1;
            }
        }

        return arr[low];
    }
    // Another Approach
    //public int findMin(int[] arr) {
    //        int low=0 ;
    //        int high = arr.length-1;
    //        int ans=Integer.MAX_VALUE;
    //        while(low<=high)
    //        {
    //            int mid=low+(high-low)/2;
    //            if(arr[low]<=arr[mid])
    //            {
    //                ans=Math.min(ans,arr[low]);
    //                low=mid+1;
    //            }
    //            else
    //            {
    //                high=mid-1;
    //                ans=Math.min(ans,arr[mid]);
    //            }
    //        }
    //        return ans;
    //    }
}

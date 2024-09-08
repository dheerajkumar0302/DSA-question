package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInSortedArrays2 {
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
        System.out.print("Enter target value:  ");
        int target =sc.nextInt();
        System.out.println(search(nums,target));
    }
    private static boolean search(int[] nums , int target)
    {
        Arrays.sort(nums);
        int low = 0 ;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low+(high - low)/2;
            if(nums[mid]==target)
                return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
            }
            else if(nums[low]<=nums[mid] )
            {
                if( nums[low]<=target &&  nums[mid] > target)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(nums[mid]<target && target <=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }

        }
        return false;
    }
}

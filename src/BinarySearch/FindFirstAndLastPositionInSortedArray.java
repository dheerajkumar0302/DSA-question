package BinarySearch;


//Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionInSortedArray {
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
        System.out.println(Arrays.toString(findFirstAndLast(nums, target)));
    }

    private static int[] findFirstAndLast(int[] nums, int target) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);

        return ans;
    }

    private static int findFirst(int[] nums , int target)
    {
        int low=0 ;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                if(mid==0 || nums[mid-1]!=nums[mid])
                    return mid;
                else
                    high=mid-1;
            }
            else if(nums[mid]>target)
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

    private static int findLast(int[] nums, int target) {
        int low=0 ;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
            else
            {
                if(mid==nums.length-1 || nums[mid]!=nums[mid+1])
                    return mid;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
}

package BinarySearch;

//Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
//
//Example 1:
//
//Input:
//N = 7, X = 2
//Arr[] = {1, 1, 2, 2, 2, 2, 3}
//Output: 4
//Explanation: x = 2 occurs 4 times in the given array so the output is 4.
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurrence {
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
        System.out.println(noOfOccurrence(nums,target));
    }

    private static int noOfOccurrence(int[] nums, int target) {
        Arrays.sort(nums);
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        if(first==-1 && last == -1)
            return 0;
        int ans = (last-first);
        return ans+1;
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

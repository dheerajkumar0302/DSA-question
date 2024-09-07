package BinarySearch;

import java.util.Scanner;


public class BinarySearchtoFindXinSortedArray {
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

    private static int search(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid =low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }
}

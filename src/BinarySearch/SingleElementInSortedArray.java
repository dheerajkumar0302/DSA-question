package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class SingleElementInSortedArray {
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
        System.out.println(singleElement(nums));
    }

    private static int singleElement(int[] nums) {
        Arrays.sort(nums);
        int low=0 ;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((mid==0 || nums[mid]!=nums[mid-1]) && (mid==nums.length-1 || nums[mid]!=nums[mid+1]))
                return nums[mid];
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1]))
                    low=mid+1;
            else
                    high = mid-1;
        }
        return -1;
    }
}

package BinarySearch;

import java.util.Scanner;

public class Count1InBinarySortedArray {
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
        System.out.println(countOnes(nums));
    }

    private static int countOnes(int[] nums) {
        int low=0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid] ==0)
                low=mid+1;
            else
            {
                if(mid==0 || nums[mid]!=nums[mid-1])
                    return nums.length-mid;
                else
                    high=mid-1;
            }

        }
        return 0;
    }

}

package Array;

import java.util.Scanner;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target  value: ");
        int target=sc.nextInt();
        System.out.println(minimumSizeSubarraySum(arr,target));
    }

    // naive method

//    private static int minimumSizeSubarraySum(int[] nums, int target) {
//
//        int minLength=Integer.MAX_VALUE;
//        for(int i = 0 ; i< nums.length ; i++)
//        {
//            int sum=0;
//            for(int j=i;j<nums.length;j++)
//            {
//                sum+=nums[j];
//                if(sum>=target)
//                {
//                    minLength=Math.min(minLength,j-i);
//                }
//            }
//        }
//        if(minLength==Integer.MAX_VALUE)
//            return 0;
//        else
//            return minLength+1;
//    }
//

    // optimal approach
    private static int minimumSizeSubarraySum(int[] nums , int target)
    {
        int sum=0;
        int left=0;
        int minLength=Integer.MAX_VALUE;

        for(int right=0 ; right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                minLength=Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }


}

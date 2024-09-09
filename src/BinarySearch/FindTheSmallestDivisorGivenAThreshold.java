package BinarySearch;

import java.util.Scanner;

//Given an array of integers nums and an integer threshold, we will choose a positive integer divisor,
// divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
//
//Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
//
//The test cases are generated so that there will be an answer.
//
//
//
//Example 1:
//
//Input: nums = [1,2,5,9], threshold = 6
//Output: 5
//Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
//If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] nums = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter threshold: ");
        int th=sc.nextInt();
        System.out.println(smallestDivisor(nums,th));
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(calculateSum(nums,mid)<=threshold)
                high=mid-1;
            else
                low=mid+1;

        }
        return low;
    }

    private static int  calculateSum(int[] nums , int divisor)
    {
        int sum=0;
        for (int num : nums) {
            sum += Math.ceil((double) num / (double) divisor);
        }
        return sum;
    }
}

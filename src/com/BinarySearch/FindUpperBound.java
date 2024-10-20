package com.BinarySearch;

import java.util.Scanner;
//Note:
//1. The upper bound in a sorted array is the index of the first value that is greater than a given value.
//2. If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
//3. Try to write a solution that runs in log(n) time complexity.
//
//
//Example:
//
//Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,
//
//Output: 2
//
//Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).
//
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= ‘n’ <= 10^5
//1 <= ‘x’ <= 10^9
//1 <= ‘arr[i]’ <= 10^9
//Time Limit: 1 sec
//Sample Input 1:
//5 7
//1 4 7 8 10
//
//
//Sample Output 1:
//3
//
//
//Explanation of sample output 1:
//In the given test case, the lowest value greater than 7 is 8 and is present at index 3(0-indexed).
//
//
//Sample Input 2:
//5 10
//1 2 5 6 10
//
//
//Sample Output 2:
//5
//
//
//Sample Input 3:
//7 5
//1 5 5 7 7 9 10
//
//
//Sample Output 3:
//3
public class FindUpperBound {
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
            System.out.println(findUpperBound(nums,target));
        }

    private static int findUpperBound(int[] arr, int x) {
        int ans= arr.length;
        int low=0;
        int high= arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<=x)
            {
                low=mid+1;
            }
            else
            {
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}

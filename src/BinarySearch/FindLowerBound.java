package BinarySearch;

import java.util.Scanner;
//. For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'.If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
//
//2. Try to do this in O(log(n)).
//
//
//Example:
//Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0
//
//Output: 0
//
//Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.
//
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= ‘n’ <= 10^5
//0 <= ‘arr[i]’ <= 10^5
//1 <= ‘x’ <= 10^5
//Sample Input 1:
//6
//1 2 2 3 3 5
//0
//
//
//Sample Output 1:
//0
//
//
//Explanation Of Sample Input 1 :
//Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.
//
//
//Sample Input 2:
//6
//1 2 2 3 3 5
//2
//
//
//Sample Output 2:
//1
//
//
//Sample Input 3:
//6
//1 2 2 3 3 5
//7
//
//
//Sample Output 3:
//6
public class FindLowerBound {
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
        System.out.println(findLowerBound(nums,target));
    }

    private static int findLowerBound(int[] nums, int x) {
        int low = 0 ;
        int high = nums.length-1;
        int ans=nums.length;
        while(low<=high)
        {
            int mid =low+(high-low)/2;
            if(nums[mid]>=x)
            {
                ans= mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        return ans;
    }
}

package com.Array;


import java.util.Scanner;

//You are given an integer array nums. You are initially positioned at the
//        array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
//
//
//        Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canJump(arr,n));
    }

    public static  boolean canJump(int[] nums , int n) {
        int maxReach = 0;  // Tracks the farthest index that can be reached

        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                // If the current index is beyond the farthest reachable point, return false
                return false;
            }

            // Update maxReach to the farthest index that can be reached from this position
            maxReach = Math.max(maxReach, i + nums[i]);

            // If the maxReach exceeds or reaches the last index, return true
            if (maxReach >= n - 1) {
                return true;
            }
        }

        // If the loop ends, return false (this case is theoretically unreachable)
        return false;
    }

}

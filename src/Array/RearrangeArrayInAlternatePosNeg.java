package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayInAlternatePosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(alternatePosNeg(arr,n)));
    }


    //NAIVE METHOD
//    private static int[] alternatePosNeg(int[] nums, int n) {
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();

        // for(int i=0 ; i<nums.length;i++)
        // {
        //     if(nums[i]>=0)
        //         pos.add(nums[i]);
        //     else
        //         neg.add(nums[i]);
        // }

        // int i=0;
        // int j=0;
        // int k=0;
        // while(i<pos.size() && j<neg.size() && k<nums.length)
        // {
        //     nums[k++]=pos.get(i++);
        //     nums[k++]=neg.get(j++);
        // }

        // while(i<pos.size())
        // {
        //     nums[k++]=pos.get(i++);
        // }

        // while(j<neg.size())
        // {
        //     nums[k++]=neg.get(j++);
        // }

        // return nums;
//    }

        // OPTIMAL SOLUTION
        private static int[] alternatePosNeg(int nums[] , int n)
        {
            int ans[] = new int[nums.length];
            int posIndex=0;
            int negIndex=1;
            for (int num : nums) {
                if (num >= 0) {
                    ans[posIndex] = num;
                    posIndex += 2;
                } else {
                    ans[negIndex] = num;
                    negIndex += 2;
                }
            }

            return ans;
        }
}

package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = duplicateElement(arr,n);

        System.out.println(ans);
    }

//    private static ArrayList<Integer> duplicateElement(int[] nums, int n) {
//        int[] hash = new int[nums.length+1];
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int num : nums) {
//            if (hash[num] == 0)
//                hash[num]++;
//            else
//                ans.add(num);
//        }
//        return ans;
//    }

    private static ArrayList<Integer> duplicateElement(int[] nums , int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0 ; i< n ; i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
                ans.add(Math.abs(nums[i]));
            else
                nums[index]=-nums[index];
        }
        return ans;
    }
}

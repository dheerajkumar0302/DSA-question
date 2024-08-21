package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target=sc.nextInt();
        System.out.println("Maximum consecutive ones : "+ Arrays.toString(twoSum(arr,n,target)));
    }



//  naive approach
//    private static int[] twoSum(int[] arr, int n, int target) {
//        int ans[] = new int[2];
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=0 ; j<n ; j++)
//            {
//
//                if(i!=j && arr[j]==target-arr[i])
//                {
//                    ans[0]=i;
//                    ans[1]=j;
//                }
//            }
//        }
//        return ans;
//    }

    // better approach using hashmap
    private static int[] twoSum(int[] arr, int n, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0 ; i<n ; i++)
        {
            if(mpp.containsKey(target-arr[i]))
            {
                return new int[]{i,mpp.get(target-arr[i])};
            }

            mpp.put(arr[i],i);
        }
        return new int[]{-1, -1};
    }

}

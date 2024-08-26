package Array;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProductSubArray(arr,n));
    }

    private static int maximumProductSubArray(int[] nums, int n) {
        int pre=1,suf=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0 ; i<n;i++)
        {
            if(pre==0)
                pre=1;
            if(suf==0)
                suf=1;
            pre*=nums[i];
            suf*=nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}

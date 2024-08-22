package Array;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraysWithGivenSum {
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
        int k=sc.nextInt();
        System.out.println(countSubarrayWithGivenSum(arr,n,k));
    }

    //NAIVE METHOD
//    private static int countSubarrayWithGivenSum(int[] arr, int n , int k) {
//
//        int cnt=0;
//        for(int i=0 ; i<n ; i++)
//        {
//            int sum=0;
//            for(int j=i;j<n ; j++)
//            {
//                sum+=arr[j];
//                if(sum==k)
//                    cnt++;
//            }
//        }
//        return cnt;
//    }

    // OPTIMAL APPROACH
    private static int countSubarrayWithGivenSum(int[] arr , int n , int k)
    {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int cnt=0;
        int sum=0;
        for(int i=0 ; i<n ; i++)
        {
            sum+=arr[i];
            int rem=sum-k;
            cnt+=mpp.getOrDefault(rem,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }

        return cnt;
    }
}

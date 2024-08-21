package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestConsecutiveSequence(arr,n));
    }

//      NAIVE METHOD
//    private static int longestConsecutiveSequence(int[] arr, int n) {
//        int longest=0;
//        for(int i=0 ; i<n ; i++)
//        {
//            int x=arr[i];
//            int cnt=1;
//
//            while(ls(arr, x + 1))
//            {
//                x=x+1;
//                cnt++;
//            }
//            longest=Math.max(longest,cnt);
//        }
//        return longest;
//    }
//
//    private static boolean ls(int[] arr, int x) {
//        for(int i=0 ; i<arr.length;i++)
//        {
//            if(arr[i]==x)
//                return true;
//        }
//        return false;
//    }

    //OPTIMAL APPROACH

    private static int longestConsecutiveSequence(int[] arr , int n)
    {
        Arrays.sort(arr);
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int cnt=1;
        int longest=1;
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i]==arr[i-1])
                continue;
            if(arr[i]-arr[i-1]==1)
                cnt++;
            else
                cnt=1;
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}

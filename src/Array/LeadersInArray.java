package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(leaders(arr,n));
    }

    //NAIVE METHOD
//    private static ArrayList<Integer> leaders (int[] arr , int n)
//    {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0 ; i<n ; i++)
//        {
//            boolean isLeader=true;
//            for(int j=i+1;j<n ; j++)
//            {
//                if (arr[j] > arr[i]) {
//                    isLeader = false;
//                    break;
//                }
//            }
//            if(isLeader)
//                ans.add(arr[i]);
//        }
//        return ans;
//    }

    //OPTIMAL SOLUTION
    private static ArrayList<Integer> leaders (int[] arr , int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}

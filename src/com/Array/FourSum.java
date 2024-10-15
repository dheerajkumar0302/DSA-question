package com.Array;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        List<List<Integer>> ans = fourSum(arr,n,target);
        for(List<Integer> it:ans)
        {
            System.out.print("[");
            for(Integer i : it)
            {
                System.out.print(i+" ");
            }
            System.out.print("] ");
        }
    }




    // naive method
//    private static List<List<Integer>> fourSum(int[] arr, int n,int target) {
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=i+1; j< n ; j++)
//            {
//                for(int k=j+1 ; k < n ; k++)
//                {
//                    for(int l=k+1 ; l<n ; l++)
//                    {
//                        long sum=arr[i]+arr[j]+arr[k]+arr[l];
//                        if(sum==target)
//                        {
//                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                            Collections.sort(temp);
//                            set.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }

    // better method using hash set
//    private static List<List<Integer>> fourSum(int[] arr, int n, int target) {
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i = 0 ; i<n ; i++)
//        {
//            for(int j=i+1 ; j< n ; j++)
//            {
//                HashSet<Long> hash = new HashSet<>();
//                for(int k =j+1 ; k< n ; k++)
//                {
//                    long sum=(long)arr[i]+arr[j]+arr[k];
//                    long fourth=target-(sum);
//                    if(hash.contains(fourth))
//                    {
//                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],(int)fourth);
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }
//                    hash.add((long)arr[k]);
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }
//

    // optimal solution
    private static List<List<Integer>> fourSum(int[] arr, int n, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        if(n<4)
            return ans;
        Arrays.sort(arr);
        for(int i=0 ; i< n-3 ; i++)
        {
            if(i!=0 && arr[i-1]==arr[i])    continue;
            for(int j=i+1 ; j< n-2 ; j++)
            {
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    long sum = (long)arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target)
                    {
                        ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1])  k++;
                        while(k<l && arr[l]==arr[l+1])  l--;
                    } else if (sum<target) {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                }
            }
        }
        return ans;
    }

}

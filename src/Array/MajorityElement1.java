package Array;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// majority element >n/2
public class MajorityElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr,n));
    }


    // NAIVE METHOD
//    private static int majorityElement(int[] arr, int n) {
//
//        for(int i=0 ; i< n ; i++)
//        {
//            int cnt=0;
//            for(int j=0 ; j< n ; j++)
//            {
//                if(arr[j]==arr[i])
//                    cnt++;
//            }
//
//            if(cnt>n/2)
//                return arr[i];
//        }
//        return -1;
//    }

    // BETTER APPROACH
    // USING HASHING
//    private static int majorityElement(int[] arr , int n)
//    {
//        HashMap<Integer,Integer> mpp = new HashMap<>();
//        for(int i=0 ; i< n ; i++)
//        {
//            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
//        }
//
//        for(Map.Entry<Integer,Integer> i : mpp.entrySet())
//        {
//            if(i.getValue()>n/2)
//                return i.getKey();
//        }
//
//        return -1;
//    }

    // OPTIMAL APPROACH
    // USING MOORE'S VOTING ALGORITHM
        private static int majorityElement(int[] arr , int n)
        {
            int ele=0;
            int cnt=0;
            for(int i=0 ; i<n ; i++)
            {
                if(cnt==0)
                {
                    ele=arr[i];
                    cnt=1;
                }
                if(arr[i]==ele)
                    cnt++;
                else cnt--;
            }
            cnt=0;
            for(int i = 0 ; i< n ; i++)
            {
                if(arr[i]==ele)
                {
                    cnt++;
                }
            }
            if(cnt>n/2)
                    return ele;
            return -1;
        }
}

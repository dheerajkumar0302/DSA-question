package Array;

import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = tripletSum(arr,n);
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
//    private static List<List<Integer>> tripletSum(int[] arr, int n) {
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0 ; i<n ; i++)
//        {
//            for(int j=i+1 ; j< n ; j++)
//            {
//                for(int k = j+1 ; k< n ; k++)
//                {
//                    int sum = arr[i]+arr[j]+arr[k];
//                    if(sum==0)
//                    {
//                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }
//                }
//            }
//        }
//
//        List<List<Integer>> ans = new ArrayList<>(set);
//        return ans;
//
//    }

    // better solution
    // using hashing

//    private static List<List<Integer>> tripletSum(int[] arr, int n) {
//
//        Set<List<Integer>> set =new HashSet<>();
//        for(int i=0 ; i< n ; i++)
//        {
//            HashSet<Integer> hash = new HashSet<>();
//            for(int j=i+1; j< n ; j++)
//            {
//
//                int sum = arr[i]+arr[j];
//                int third =-(sum);
//                if(hash.contains(third))
//                {
//                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
//                    temp.sort(null);
//                    set.add(temp);
//                }
//                hash.add(arr[j]);
//            }
//        }
//        List<List<Integer>> ans = new ArrayList<>(set);
//        return ans;
//    }

    // Optimal Solution
    // double pointer approach
    private static List<List<Integer>> tripletSum(int[] arr, int n) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(arr);
            for(int i = 0 ; i< n ; i++)
            {
                if(i!=0 && arr[i]==arr[i-1])    continue;
                if(arr[i]>0)
                    break;
                int j=i+1 ;
                int k=n-1;
                while(j<k)
                {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==0)
                    {
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        while(j<k && arr[j]==arr[j-1])  j++;
                        while(j<k && arr[k]==arr[k+1])  k--;
                    } else if (sum<0) {
                        j++;
                    }
                    else {
                        k--;
                    }
                }
            }
            return ans;
    }
}

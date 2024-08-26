package Array;

import java.util.*;


//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
public class MajorityElementPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = majorityElement(arr,n);

        System.out.println(ans);
    }


    // better approach
//    private static List<Integer> majorityElement(int[] nums, int n) {
//        Map<Integer,Integer> mpp = new HashMap<>();
//        List<Integer> ans = new ArrayList<>();
//        for(int i=0 ; i<nums.length;i++)
//        {
//            int value=mpp.getOrDefault(nums[i],0);
//            mpp.put(nums[i],value+1);
//        }
//
//        for(Map.Entry<Integer,Integer> i : mpp.entrySet())
//        {
//            if(i.getValue()>nums.length/3)
//                ans.add(i.getKey());
//        }
//        return ans;
//    }

//    Optimal Solution
    private static List<Integer> majorityElement(int[] nums , int n)
    {
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int cnt1=0,cnt2=0;
        for(int i=0 ; i< n ; i++)
        {
            if(cnt1==0 && nums[i]!=ele2)
            {
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1)
            {
                cnt2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i])   cnt1++;
            else if(ele2==nums[i])   cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;
        cnt2=0;

        for(int i=0; i<n; i++)
        {
            if(nums[i]==ele1)
                cnt1++;
            else if(nums[i]==ele2)
                cnt2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(cnt1>(n/3))
            ans.add(ele1);
        if(cnt2>(n/3))
            ans.add(ele2);

        return ans;
    }
}

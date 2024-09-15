package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countInversion(arr,n));
    }

    private static int countInversion(int[] arr, int n) {
        return mergeSort(arr,0,n-1);
    }

    private static int  mergeSort(int arr[] , int l , int r)
    {
        int cnt=0;
        if(l>=r)
            return cnt;
        int mid=l+(r-l)/2;
        cnt+=mergeSort(arr,l,mid);
        cnt+=mergeSort(arr,mid+1,r);
        cnt+=merge(arr,l,mid,r);
        return cnt;
    }

    private static int  merge(int[] arr, int l, int mid, int r) {
        int cnt=0;
        ArrayList<Integer> temp = new ArrayList<>();
        int left=l;
        int right=mid+1;
        while (left<=mid && right<=r)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                cnt+=(mid-left)+1;
                temp.add(arr[right]);
                right++;
            }

        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=r)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=l ; i<=r ; i++)
        {
            arr[i]=temp.get(i-l);
        }
       return cnt;
    }
}

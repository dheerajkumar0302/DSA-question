package Array;

import java.util.Scanner;

public class MaximumConsecutiveones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum consecutive ones : "+maximumConsecutiveOne(arr,n));
    }

    static int maximumConsecutiveOne(int[] nums , int n)
    {
        int maxCount=0;
        int count=0;
        for (int num : nums) {
            if (num == 1) {
                count++;

            } else
                count = 0;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}

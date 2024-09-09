package Array;

import java.util.Scanner;

public class LargestThirdNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(largestThird(nums));
    }

    private static int largestThird(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third=Long.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num > first) {
                third = second;
                second = num;
            } else if (num > third && num > second && num > first) {
                third = num;
            }
        }
        return (third==Long.MIN_VALUE)?(int)first:(int)third;
    }
}

package com.BinarySearch;

import java.util.Scanner;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        long n = sc.nextLong();
        System.out.println(floorSqrt(n));
    }

    private static long floorSqrt(long n) {
        if(n==1)
            return 1;
        long low=0;
        long high=n-1;
        while(low<=high)
        {
            long mid = low+(high-low)/2;
            long sq=mid*mid;
            if(sq==n)
                return mid;
            else if(sq>n)
                high=mid-1;
            else
                low=mid+1;
        }

        return high;
    }
}

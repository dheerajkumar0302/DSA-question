package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of price : ");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("Enter price: ");
        for(int i=0 ; i<n ; i++)
        {
            price[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(calculateSpan(price , n)));
    }

    private static int[] calculateSpan(int[] price, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[n];
        span[0]=1;
        stack.push(0);
        for(int i=1 ; i<n ; i++)
        {
            while(!stack.isEmpty() && price[i]>=price[stack.peek()])
            {
                stack.pop();
            }

            span[i]=stack.isEmpty()?i+1 : i-stack.peek();
            stack.push(i);
        }

        return span;
    }
}

package com.stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter price: ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(prevGreaterElement(arr,n)));
    }

    private static int[] prevGreaterElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] prev=new int[n];
        prev[0]=-1;
        stack.push(0);
        for(int i=1 ; i<n ; i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                stack.pop();
            }

            prev[i]= stack.isEmpty()?-1:arr[stack.peek()];
            stack.push(i);
        }
        return prev;
    }


}

package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
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
        System.out.println(Arrays.toString(nextGreaterElement(arr,n)));
    }
    private static int[] nextGreaterElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        // Initialize the last element's result to -1 (no greater element).
        result[n - 1] = -1;
        stack.push(n - 1);  // Push the index of the last element.
        // Traverse the array from right to left.
        for (int i = n - 2; i >= 0; i--) {
            // Pop elements from the stack until a greater element is found.
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, no greater element exists.
            result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];

            // Push the current index onto the stack.
            stack.push(i);
        }
        return result;
    }
}

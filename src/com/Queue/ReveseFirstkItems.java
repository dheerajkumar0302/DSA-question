package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReveseFirstkItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of element : ");
        int n = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println("Enter value: ");

        for(int i=0 ; i<n ; i++)
        {
            queue.offer(sc.nextInt());
        }
        System.out.println("Enter pos for reverse: ");
        int k = sc.nextInt();
        Queue<Integer> ans = modifyQueue(queue,k);
        System.out.println(ans);
    }

    private static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<k ; i++)
        {
            stack.push(q.poll());
        }


        while(!stack.isEmpty())
        {
            q.offer(stack.pop());
        }

        int remaining=q.size()-k;
        for(int i=0 ; i<remaining ; i++)
        {
            q.offer(q.poll());
        }
        return q;
    }
}

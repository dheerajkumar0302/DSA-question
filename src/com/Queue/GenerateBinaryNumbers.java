package com.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =  sc.nextInt();
        ArrayList<String> arr = generate(n);
        System.out.println(arr);
    }
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> binary = new ArrayList<>();
        ArrayDeque<String> q = new ArrayDeque<>();

        q.offer("1");
        for(int i=1 ; i<=N ; i++)
        {

            String current=q.poll();
            binary.add(current);
            q.offer(current+"0");
            q.offer(current+"1");
        }

        return binary;
    }
}

package com.stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parenthesis");
        String str = sc.nextLine();
        System.out.println(isPar(str));
    }

    static boolean isPar(String x)
    {
        // add your code here
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0 ; i<x.length() ; i++)
        {
            if(stack.isEmpty() || x.charAt(i)=='(' || x.charAt(i)=='[' || x.charAt(i)=='{')
                stack.push(x.charAt(i));
            else if((stack.peek()=='(' && x.charAt(i)==')') || (stack.peek()=='[' && x.charAt(i)==']') || (stack.peek()=='{' && x.charAt(i)=='}'))
                stack.pop();
            else
                stack.push(x.charAt(i));
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}

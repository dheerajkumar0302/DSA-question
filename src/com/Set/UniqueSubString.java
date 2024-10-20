package com.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String  : ");
        String str = sc.nextLine();
        System.out.println(uniqueSubString(str));
    }

    private static int uniqueSubString(String str) {
        Set<String> set = new HashSet<>();
        for(int i=0 ; i<str.length() ; i++)
        {
            for(int j=i+1 ; j<=str.length() ; j++)
            {
                set.add(str.substring(i,j));
            }
        }
        return set.size();
    }
}

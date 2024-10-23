package com.Set;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class PrintDifferentCharacterInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String  : ");
        String str = sc.nextLine();
        System.out.println(sortedCharacter(str));
    }

    private static String sortedCharacter(String str) {
        TreeSet<Character> set = new TreeSet<>();
        for(char s : str.toCharArray())
        {
            set.add(s);
        }
        StringBuilder ans = new StringBuilder();
        for(char s : set)
        {
            ans.append(s);
        }
        return ans.toString();
    }
}

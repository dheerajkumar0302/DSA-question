package com.string;

import java.util.Scanner;

public class PanagramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPanagram(str));
    }

    private static boolean isPanagram(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}

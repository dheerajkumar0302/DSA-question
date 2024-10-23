package com.string;

import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1,String str2) {

        int[] freq = new int[256];
        for(int i=0 ; i<str1.length() ; i++)
        {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int i=0 ; i<256 ; i++)
        {
            if(freq[i]!=0)
                return false;
        }

        return true;
    }
}

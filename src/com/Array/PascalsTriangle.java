package com.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        List<List<Integer>> ans = pascalTrianglr(n);
        for(List<Integer> it:ans)
        {
            System.out.print("[");
            for(Integer i : it)
            {
                System.out.print(i+" ");
            }
            System.out.print("] ");
        }
    }

    private static List<List<Integer>> pascalTrianglr(int n) {
        List<List<Integer>> ans = new ArrayList<>();
       for(int i=1 ; i<=n ; i++)
       {
           ans.add(generateRow(i));
       }
        return ans;
    }

    private static List<Integer> generateRow(int row) {
        List<Integer> ansRow = new ArrayList<>();
        long ans=1;
        ansRow.add(1);
        for(int col=1 ; col<row ; col++ )
        {
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

// Another approach
//    public static int[][] pascalTriangle(int N) {
//        int[][] ans = new int[N][];
//
//        for (int i = 0; i < N; i++) {
//            // Initialize each row with i + 1 elements
//            ans[i] = new int[i + 1];
//
//            // First and last elements in each row are 1
//            ans[i][0] = 1;
//            ans[i][i] = 1;
//
//            // Fill in the rest of the row
//            for (int j = 1; j < i; j++) {
//                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
//            }
//        }
//
//        return ans;
}

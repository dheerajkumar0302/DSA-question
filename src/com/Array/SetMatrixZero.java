package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix array : ");
        System.out.print("Enter row: ");
        int n = sc.nextInt();
        System.out.print("Enter column: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter matrix: ");
        for(int i=0 ; i< n ; i++)
        {
            for(int j=0 ; j<m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        setMatrixZero(arr,n,m);
        for(int i=0 ; i< n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

//    private static void setMatrixZero(int[][] arr, int n, int m) {
//
//        // naive method
//
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=0 ; j<m ; j++)
//            {
//                if(arr[i][j]==0)
//                {
//                    setRow(arr,i,m);
//                    setCol(arr,j,n);
//                }
//            }
//        }
//
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=0 ; j< m ; j++)
//            {
//                if(arr[i][j]==-1)
//                    arr[i][j]=0;
//            }
//        }
//
//    }
//
//
//
//    private static void setRow(int[][] arr ,int i,int m) {
//        for(int j=0 ; j<m ; j++ )
//        {
//            if(arr[i][j]!=0)
//                arr[i][j]=-1;
//        }
//    }
//
//    private static void setCol(int[][] arr, int j, int n) {
//        for(int i=0 ; i<n ; i++ )
//        {
//            if(arr[i][j]!=0)
//                arr[i][j]=-1;
//        }
//    }

    // BETTER APPROACH
//    private static void setMatrixZero(int[][] arr , int n , int m)
//    {
//        int row[] = new int[n];
//        int[] col = new int[m];
//
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=0 ; j<m; j++)
//            {
//                if(arr[i][j]==0)
//                {
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//
//
//        for(int i=0 ; i<n ; i++)
//        {
//            for(int j=0 ; j<m ; j++)
//            {
//                if(row[i]==1 || col[j]==1)
//                {
//                    arr[i][j]=0;
//                }
//            }
//        }
//    }

//     OPTIMAL SOLUTION

    private static void setMatrixZero(int[][] arr , int n , int m)
    {
        int col0=1;
        for(int i = 0 ; i< n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(arr[i][j]==0) {
                    arr[i][0] = 0;

                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }


        for(int i=1 ; i<n ; i++)
        {
            for(int j=1 ; j< m ; j++)
            {

                    if(arr[i][0]==0 || arr[0][j]==0)
                            arr[i][j]=0;
            }
        }

        if(arr[0][0]==0)
        {
            for(int j =0 ; j< m ; j++)
            {
                arr[0][j]=0;
            }
        }

        if(col0==0)
        {
            for(int i=0 ; i<n ; i++)
            {
                arr[i][0]=0;
            }
        }
    }
}

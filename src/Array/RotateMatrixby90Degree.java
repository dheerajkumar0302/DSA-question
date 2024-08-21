package Array;

import java.util.Scanner;

public class RotateMatrixby90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix array : ");
        System.out.print("Enter row: ");
        int n = sc.nextInt();
        System.out.print("Enter column: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix: ");
        for(int i=0 ; i< n ; i++)
        {
            for(int j=0 ; j<n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] ans = rotateMatrix(arr,n);
        for(int i=0 ; i< n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }


    //NAIVE METHOD
//    private static int[][] rotateMatrix(int[][] arr, int n) {
//        int[][] ans = new int[n][n];
//        for(int i=0 ; i< n ; i++)
//        {
//            for(int j=0 ; j<n ; j++)
//            {
//                ans[j][n-1-i]=arr[i][j];
//            }
//        }
//        return ans;
//    }


    //OPTIMAL SOLUTION
    private static int[][] rotateMatrix(int[][] arr , int n )
    {
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n/2 ; j++)
            {
                int tem=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=tem;

            }
        }

        return arr;
    }

}

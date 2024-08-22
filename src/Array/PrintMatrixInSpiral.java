package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMatrixInSpiral {
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
        ArrayList<Integer> ans = new ArrayList<>();
        ans=printMatrixInSpiral(arr,n,m);
        for(int i=0 ; i<ans.size();i++)
        {
            System.out.print(ans.get(i));
        }

    }

    private static ArrayList<Integer> printMatrixInSpiral(int[][] arr , int n, int m)
    {
        int top=0,bottom=n-1,left=0,right=m-1;


        ArrayList<Integer> ans = new ArrayList<>();
        // left to right
        while(left<=right && top<=bottom) {
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }

            top++;

            // top to bottom

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }

            right--;

            // right to left

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            // bottom to top

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }

                left++;
            }
        }

        return ans;
    }
}

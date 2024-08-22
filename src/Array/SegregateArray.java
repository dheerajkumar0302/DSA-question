package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SegregateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(segregateElement(arr, n)));
    }

    private static int[] segregateElement(int[] arr, int n) {

        ArrayList<Integer> neg = new ArrayList<>();
        // Your code goes here

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]<0)
                neg.add(arr[i]);
        }

        int index=0;
        for(int i=0 ; i<n;i++)
        {
            if(arr[i]>=0)
                arr[index++]=arr[i];
        }

        for(int i=0; i<neg.size();i++)
        {
            arr[index++]=neg.get(i);
        }

        return arr;
    }
}

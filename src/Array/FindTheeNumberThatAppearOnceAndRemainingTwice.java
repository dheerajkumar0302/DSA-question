package Array;

import java.util.Scanner;

public class FindTheeNumberThatAppearOnceAndRemainingTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number that appear once : "+numberThatAppearOnce(arr,n));
    }

    private static int numberThatAppearOnce(int[] arr, int n) {
        int xor=0;
        for (int j : arr) {
            xor = xor ^ j;
        }
        return xor;
    }
}

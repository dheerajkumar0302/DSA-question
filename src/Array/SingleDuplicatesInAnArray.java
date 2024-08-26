package Array;

import java.util.Scanner;

public class SingleDuplicatesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicatesInAnArray(arr,n));
    }

    private static int duplicatesInAnArray(int[] arr, int n) {

        int slow=arr[0];
        int fast=arr[0];

        do{
            slow=arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);

        fast=arr[0];

        while(slow!=fast)
        {
            slow=arr[slow];
            fast=arr[fast];
        }

        return arr[slow];
    }
}

//
//Example 1:
//
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRightByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0 ; i< n ;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value by which we want to rotate array: ");
        int k=sc.nextInt();
        rotateArray(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }

//    static void rotateArray(int[] arr , int n , int k)
//    {
//        k=k%n;
//        if(k>n)
//            return ;
//        int[] temp = new int[n-k];
//        // store first part
//        for(int i=0 ; i<temp.length;i++)
//        {
//            temp[i]=arr[i]; //1 2 3 4
//        }
//
//        int j=0 ;
//        for(int i=0 ; i<k ; i++)
//        {
//            arr[j]=arr[i+temp.length];  // 5 6 7
//            j++;
//        }
//
//        for(int i=k ; i< n ; i++)
//        {
//            arr[j++]=temp[i-k];  // 1 2 3 4
//        }
//
//    }

    static void rotateArray(int[] arr, int n ,int k){
        rotate(arr,0,n-k-1);
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-1);
    }

    static void rotate(int[] arr , int low , int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

}

package Array;
import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.largestElement(arr,n));
    }
}
class Solution
{
    public  int largestElement(int[] arr , int n)
    {
        int max=Integer.MIN_VALUE;// store smallest value;
        for(int i=0 ; i<n ; i++)
        {
            max=Math.max(max,arr[i]);// in every step store maximum number
        }
        return max;// return largest element
    }
}

package BinarySearch;
//A conveyor belt has packages that must be shipped from one port to another within days days.
//
//The ith package on the conveyor belt has a weight of weights[i].
// Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
// We may not load more weight than the maximum weight capacity of the ship.
//
//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
//
//
//
//Example 1:
//
//Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//Output: 15
//Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
//1st day: 1, 2, 3, 4, 5
//2nd day: 6, 7
//3rd day: 8
//4th day: 9
//5th day: 10
//
//Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and
// splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] nums = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter days: ");
        int days=sc.nextInt();
        System.out.println(shipWithinDays(nums,days));
    }

    private static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        for (int i : weights) {
            low = Math.max(low, i);
        }
        int high=0;
        for (int weight : weights) {
            high += weight;
        }
        for(int i=low ; i<=high;i++)
        {
            if(possible(weights,i,days))
                return i;
        }
        return -1;
    }

    private static boolean possible(int[] weights , int capacity,int days)
    {
        int sum=0;
        int cnt=1;
        for (int weight : weights) {
            sum += weight;
            if (sum > capacity) {
                cnt++;
                sum = weight;
            }
        }
        return cnt<=days;

    }




    // optimized
//    private static int shipWithinDays(int[] weights, int days) {
//       int low = Integer.MIN_VALUE;
//       for (int i : weights) {
//            low = Math.max(low, i);
//       }
//        int high=0;
//        for(int i=0 ; i<weights.length;i++)
//        {
//            high+=weights[i];
//        }
//       while(low<=high)
//       {
//        int mid=low+(high-low)/2;
//          if(possible(weights,mid,days))
//                high=mid-1;
//            else
//                low=mid+1;
//       }
//       return low;
//    }
}

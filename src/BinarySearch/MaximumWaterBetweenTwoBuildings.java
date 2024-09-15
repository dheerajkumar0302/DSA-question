package BinarySearch;
//Given an integer array representing the heights of N buildings,
// the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
//Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.
//
//Example 1:
//
//Input:
//N = 6
//height[] = {2,1,3,4,6,5}
//Output: 8
//Explanation: The heights are 2 1 3 4 6 5.
//So we choose the following buildings
//2,5  and remove others. Now gap between
//two buildings is equal to 4, and the
//height of smaller one is 2. So answer is
//2 * gap = 2*4 = 8. There is
//no answer greater than this.
import java.util.Scanner;

public class MaximumWaterBetweenTwoBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxWater(heights,n));
    }

    private static int maxWater(int[] heights, int n) {

        int left=0;
        int right = heights.length-1;
        int maxWater=0;

        while(left<right)
        {
            int height=Math.min(heights[left],heights[right]);
            int width=right-left-1;
            int water=width * height;


            maxWater=Math.max(maxWater,water);


            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }


    // brute forced
//    private static int maxWater(int[] heights, int n) {
//        int maxWater = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                // Calculate water trapped between buildings i and j
//                int height = Math.min(heights[i], heights[j]);
//                int width = j - i - 1;
//                int water = width * height;
//                // Update maximum water trapped
//                maxWater = Math.max(maxWater, water);
//            }
//        }
//        return maxWater;
//    }
}

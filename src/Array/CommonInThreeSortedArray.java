package Array;

import java.util.ArrayList;
import java.util.List;

public class CommonInThreeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> result = commonElements(arr1, arr2, arr3);
        System.out.println(result); // Output: [20, 80]
    }

    private static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        // Traverse all arrays
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            // If the current elements of all three arrays are equal
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                int current = arr1[i];
                while (i < arr1.length && arr1[i] == current) {
                    i++;
                }

                // Skip duplicates in arr2
                current = arr2[j];
                while (j < arr2.length && arr2[j] == current) {
                    j++;
                }

                // Skip duplicates in arr3
                current = arr3[k];
                while (k < arr3.length && arr3[k] == current) {
                    k++;
                }
            }
            // Move pointer for arr1 if it's the smallest element
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            // Move pointer for arr2 if it's the smallest element
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            // Move pointer for arr3 if it's the smallest element
            else {
                k++;
            }
        }

        return result;
    }
}

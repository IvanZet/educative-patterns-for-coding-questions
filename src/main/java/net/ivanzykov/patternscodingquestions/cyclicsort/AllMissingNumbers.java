package net.ivanzykov.patternscodingquestions.cyclicsort;

import java.util.ArrayList;
import java.util.List;

/**
 * We are given an unsorted array containing numbers taken from the range 1 to ‘n’. The array can have duplicates,
 * which means some numbers will be missing. Find all those missing numbers.
 */
public class AllMissingNumbers {

    public static List<Integer> findNumbers(int[] nums) {
        sortNumbers(nums);
        return findMissingNumbersInSortedArray(nums);
    }

    public static void sortNumbers(int[] nums) {
        // Sort the array
        int i = 0;
        while (i < nums.length) {
            // Compare value on current idx with value in correct idx
            if (nums[i] != nums[nums[i] - 1]) {
                swapElements(i, nums);
            } else {
                // Iterate the array
                i++;
            }
        }
    }

    public static void swapElements(int i, int[] nums) {
        int temp = nums[i];
        int correctIdx = nums[i] - 1;
        nums[i] = nums[correctIdx];
        nums[correctIdx] = temp;
    }

    public static List<Integer> findMissingNumbersInSortedArray(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        // Find all missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1) {
                missingNumbers.add(j + 1);
            }
        }
        return missingNumbers;
    }
}

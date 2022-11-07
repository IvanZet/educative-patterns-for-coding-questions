package net.ivanzykov.patternscodingquestions.cyclicsort;

public class MissingNumber{

    public static int findMissingNumber(int[] arr) {
        // Iterate the array
        int i = 0;
        while (i < arr.length) {
            // Value has to be smaller than array's size and compare value with index
            if (arr[i] < arr.length && i != arr[i]) {
                // Swap
                int correctIdx = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = correctIdx;
            } else {
                // Iterate the array
                i++;
            }

        }

        // Compare each val with index
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }

        // If all numbers are present
        return arr.length;
    }
}

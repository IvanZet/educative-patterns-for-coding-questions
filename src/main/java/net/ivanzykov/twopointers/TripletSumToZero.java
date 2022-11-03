package net.ivanzykov.twopointers;

import java.util.*;

class TripletSumToZero {

    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);

        // Keep two last indexes for the pair search
        for (int xIdx = 0; xIdx < arr.length - 2; xIdx++) {
            // Skip the same number to ensure unique triples
            if (xIdx > 0 && arr[xIdx - 1] == arr[xIdx]) {
                continue;
            }

            searchPair(arr, -arr[xIdx], xIdx + 1, triplets);

        }

        return triplets;
    }

    private static void searchPair(int[] arr, int target, int leftIdx, List<List<Integer>> triplets) {
        int rightIdx = arr.length - 1;

        while (leftIdx < rightIdx) {
            int leftNum = arr[leftIdx];
            int rightNum = arr[rightIdx];
            int sum = leftNum + rightNum;

            if (sum == target) {
                triplets.add(Arrays.asList(- target, leftNum, rightNum));
                leftIdx++;
                rightIdx--;
                // Skip duplicate numbers on the left to ensure unique triples
                while (leftIdx < rightIdx && arr[leftIdx - 1] == arr[leftIdx]) {
                    leftIdx++;
                }
                // Skip duplicate numbers on the right to ensure unique triples
                while (leftIdx < rightIdx && arr[rightIdx] == arr[rightIdx + 1]) {
                    rightIdx--;
                }
            } else if (sum > target) {
                rightIdx--; // We need a pair with bigger sum
            } else {
                leftIdx++; // We need a pair with smaller sum
            }
        }
    }

}
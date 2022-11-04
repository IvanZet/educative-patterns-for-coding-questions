package net.ivanzykov.patternscodingquestions.twopointers;

class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int valI = arr[i];
            int valJ = arr[j];
            int sum = valI + valJ;

            if (sum == targetSum) {
                return new int[] {i, j};
            } else if (sum > targetSum) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] { -1, -1 };
    }
}

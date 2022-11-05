package net.ivanzykov.patternscodingquestions.cyclicsort;

class CyclicSort {

    public static void sortAlt(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int expectedNum = i + 1;
            if (nums[i] != expectedNum) {
                int buffer = nums[i];
                nums[i] = expectedNum;
                nums[buffer - 1] = buffer;
            }
        }
    }

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int expIdx = nums[i] - 1;
            if (nums[i] != nums[expIdx]) {
                int buffer = nums[i];
                nums[i] = nums[expIdx];
                nums[expIdx] = buffer;
            } else {
                i++;
            }
        }
    }
}

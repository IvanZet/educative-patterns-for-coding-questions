package net.ivanzykov.twopointers;

class RemoveDuplicates {

    public static int remove(int[] arr) {
        int afterUnique = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[afterUnique - 1] != arr[i]) {
                arr[afterUnique] = arr[i];
                afterUnique++;
            }
        }

        return afterUnique;
    }
}

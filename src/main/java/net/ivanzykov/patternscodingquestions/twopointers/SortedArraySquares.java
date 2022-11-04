package net.ivanzykov.patternscodingquestions.twopointers;

class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        int i = right;

        while (left < right) {
            int squareLeft = arr[left] * arr[left];
            int squareRight = arr[right] * arr[right];

            if (squareLeft > squareRight) {
                squares[i] = squareLeft;
                left++;
                i--;
            } else {
                squares[i] = squareRight;
                right--;
                i--;
            }
        }

        return squares;
    }
}


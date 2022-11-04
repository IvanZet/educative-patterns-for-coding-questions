package net.ivanzykov.patternscodingquestions.twopointers;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class PairWithTargetSumTest extends TestCase {

    public void testSearch() {
        int[] input = {1, 2, 3, 4, 6};
        int[] expected = {1, 3};
        assertArrayEquals(expected, PairWithTargetSum.search(input, 6));
    }
}
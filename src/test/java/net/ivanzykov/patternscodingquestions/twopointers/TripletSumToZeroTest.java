package net.ivanzykov.patternscodingquestions.twopointers;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZeroTest extends TestCase {

    public void testSearchTriplets() {
        int[] input = new int[] { -5, 2, -1, -2, 3 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-5, 2 ,3));
        expected.add(Arrays.asList(-2, -1, 3));
        assertEquals(expected, TripletSumToZero.searchTriplets(input));
    }
}
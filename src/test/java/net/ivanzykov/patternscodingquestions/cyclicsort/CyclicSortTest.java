package net.ivanzykov.patternscodingquestions.cyclicsort;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class CyclicSortTest extends TestCase {

    public void testSort() {
        int[] input = {3, 1, 5, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        CyclicSort.sort(input);
        assertArrayEquals(expected, input);
    }
}
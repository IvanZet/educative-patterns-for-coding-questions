package net.ivanzykov.patternscodingquestions.cyclicsort;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class AllMissingNumbersTest extends TestCase {

    public void testFindNumbers() {
        int [] input = {2, 3, 1, 8, 2, 3, 5, 1};
        List<Integer> expected = Arrays.asList(4, 6, 7);
        assertEquals(expected, AllMissingNumbers.findNumbers(input));
    }
}
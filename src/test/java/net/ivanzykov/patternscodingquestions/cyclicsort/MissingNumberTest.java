package net.ivanzykov.patternscodingquestions.cyclicsort;

import junit.framework.TestCase;

public class MissingNumberTest extends TestCase {

    public void testFindMissingNumber() {
        int[] input = {0, 2, 4, 6, 7, 8, 3, 9, 5, 10};
        assertEquals(1, MissingNumber.findMissingNumber(input));
    }
}

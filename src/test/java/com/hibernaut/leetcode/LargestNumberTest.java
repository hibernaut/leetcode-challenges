package com.hibernaut.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test
    public void basicTest() {
        assertEquals("210", LargestNumber.largestNumber(new int[]{10, 2}));
        assertEquals("9534330", LargestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        assertEquals("1", LargestNumber.largestNumber(new int[]{1}));
        assertEquals("0", LargestNumber.largestNumber(new int[]{0, 0, 0, 0}));
        assertEquals("10", LargestNumber.largestNumber(new int[]{10}));
        assertEquals("43243432", LargestNumber.largestNumber(new int[]{432,43243}));
        assertEquals("56145123121000", LargestNumber.largestNumber(new int[]{56, 145, 12, 10, 0, 0, 123}));
    }

    @Test
    public void edgeTest() {
        assertEquals("46699744562536987213214712411112",
                LargestNumber.largestNumber(new int[]{45625, 124, 36987, 11112, 4669974, 2132147}));
        assertEquals("987555222897812314879794654879794541587236145465487989369744128213479612147365211132479854123245647",
                LargestNumber.largestNumber(new int[]{465487989, 123245647, 879794541, 213479612, 879794654, 897812314,
                        132479854, 369744128, 147365211, 587236145, 987555222}));
    }
}

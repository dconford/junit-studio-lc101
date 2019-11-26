package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

        //@Before
        int[] testArray = new int[] {2,5,8,12,16,23,38,56,72,91};  //10 numbers

        @Test
        public void emptyTest() {
            assertEquals(10,10,.001);
        }


        @Test
        public void testReturnsTrue() {
            assertEquals(-1, BonusBinarySearch.binarySearch(testArray, 7) );
            assertEquals(-1, BonusBinarySearch.binarySearch(testArray, 70) );
            assertEquals(-1, BonusBinarySearch.binarySearch(testArray, 1) );
            assertEquals(-1, BonusBinarySearch.binarySearch(testArray, 700) );
            assertEquals(-1, BonusBinarySearch.binarySearch(testArray, -7) );
            assertEquals(8, BonusBinarySearch.binarySearch(testArray, 72) );
            assertEquals(9, BonusBinarySearch.binarySearch(testArray, 91) );
            assertEquals(0, BonusBinarySearch.binarySearch(testArray, 2) );
            assertEquals(4, BonusBinarySearch.binarySearch(testArray, 16) );
            //assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

        }
    }


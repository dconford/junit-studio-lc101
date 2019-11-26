package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
/*
hese strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
 */
    @Test
    public void BracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(""));
        assertTrue(test_Class.hasBalancedBrackets(" "));
        assertTrue(test_Class.hasBalancedBrackets("[]"));
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void unmatchedBracketsReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]["));
        assertFalse(test_Class.hasBalancedBrackets("["));
        assertFalse(test_Class.hasBalancedBrackets("]"));
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
        assertFalse(test_Class.hasBalancedBrackets("[Launch[Code]"));
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode["));
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
        assertFalse(test_Class.hasBalancedBrackets("]La,La, La, [Love] is all you need["));
    }


}

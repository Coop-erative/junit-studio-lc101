package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    //12 tests requested:
    //test 1 -
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //test 2 -
    @Test
    public void emptyStrReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //test 3 -
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //test 4 -
    @Test
    public void balancedBracketsWithAdditionalCharactersBetween() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }
    //test 5 -
    @Test
    public void balancedBracketsWithAdditionalCharactersOutside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Test"));

    }
    //test 6 -
    @Test
    public void balancedBracketsWithAdditionalCharactersInOut() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Te[st]"));
    }
    //test 7 -
    @Test
    public void unbalancedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
//    //test 8 -
    @Test
    public void unbalancedBracketsWithCharInAndOut() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Te]st["));
    }
//    //test 9 -
    @Test
    public void multipleBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
//    //test 10 -
    @Test
    public void internalMultipleBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
//    //test 11 -
    @Test
    public void multipleUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }
//    //test 12 -
    @Test
    public void oddNumberofBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
}

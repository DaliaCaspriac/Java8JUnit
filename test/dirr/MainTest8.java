package dirr;

import dirr.no_peeking.TestGenerators;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest8 {


    @Test
    public void countNumbers() {
        assertEquals(Main8.countNumbers(), TestGenerators.countNumbers());
    }

    @Test
    public void getMaxNumber() {
        assertEquals(Main8.getMaxNumber(), TestGenerators.getMaxNumber());
    }

    @Test
    public void getAllTwoDigitNumbers() {
        assertEquals(Main8.getAllTwoDigitNumbers(), TestGenerators.getAllTwoDigitNumbers());
    }
//
//    @Test
//    public void getAllNumbersPlus100() {
//        assertEquals(Main8.getAllNumbersPlus100(), TestGenerators.getAllNumbersPlus100());
//    }
//
//    @Test
//    public void countAllEvenNumbers() {
//        assertEquals(Main8.countAllEvenNumbers(), TestGenerators.countAllEvenNumbers());
//    }
//
//    @Test
//    public void getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
//        assertEquals(Main8.getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse(), TestGenerators.getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse());
//    }
//
//    @Test
//    public void getAnyStringOfLength8() {
//        assertEquals(Main8.getAnyStringOfLength8(), TestGenerators.getAnyStringOfLength8());
//    }
//
//    @Test
//    public void getAnyStringOfLength30() {
//        assertEquals(Main8.getAnyStringOfLength30(), TestGenerators.getAnyStringOfLength30());
//    }
//
//    @Test
//    public void getAllStringsShorterThan10Characters() {
//        assertEquals(Main8.getAllStringsShorterThan10Characters(), TestGenerators.getAllStringsShorterThan10Characters());
//    }
//
//    @Test
//    public void getIntegerListOfAllStringLengths() {
//        assertEquals(Main8.getIntegerListOfAllStringLengths(), TestGenerators.getIntegerListOfAllStringLengths());
//    }
//
//    @Test
//    public void getTotalCharactersInStringsList() {
//        assertEquals(Main8.getTotalCharactersInStringsList(), TestGenerators.getTotalCharactersInStringsList());
//    }
//
//    @Test
//    public void getAllStringsWhichStartWithA() {
//        assertEquals(Main8.getAllStringsWhichStartWithSmallA(), TestGenerators.getAllStringsWhichStartWithA());
//    }
//
//    @Test
//    public void getAllStringsWhichContainB() {
//        assertEquals(Main8.getAllStringsWhichContainSmallB(), TestGenerators.getAllStringsWhichContainB());
//    }
//
//    @Test
//    public void getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
//        assertEquals(Main8.getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters(), TestGenerators.getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters());
//    }
}

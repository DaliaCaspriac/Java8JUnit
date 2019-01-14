package dirr;


import dirr.no_peeking.TestGenerators;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest7 {


    @Test
    public void countNumbers() {
        assertEquals(Main7.countNumbers(), TestGenerators.countNumbers());
    }

//    @Test
//    public void getMaxNumber() {
//        assertEquals(Main7.getMaxNumber(), TestGenerators.getMaxNumber());
//    }
//
//    @Test
//    public void getAllTwoDigitNumbers() {
//        assertEquals(Main7.getAllTwoDigitNumbers(), TestGenerators.getAllTwoDigitNumbers());
//    }
//
//    @Test
//    public void getAllNumbersPlus100() {
//        assertEquals(Main7.getAllNumbersPlus100(), TestGenerators.getAllNumbersPlus100());
//    }
//
//    @Test
//    public void countAllEvenNumbers() {
//        assertEquals(Main7.countAllEvenNumbers(), TestGenerators.countAllEvenNumbers());
//    }
//
//    @Test
//    public void getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
//        assertEquals(Main7.getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse(), TestGenerators.getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse());
//    }
//
//    @Test
//    public void getAnyStringOfLength8() {
//        assertEquals(Main7.getAnyStringOfLength8(), TestGenerators.getAnyStringOfLength8());
//    }
//
//    @Test
//    public void getAnyStringOfLength30() {
//        assertEquals(Main7.getAnyStringOfLength30(), TestGenerators.getAnyStringOfLength30());
//    }
//
//    @Test
//    public void getAllStringsShorterThan10Characters() {
//        assertEquals(Main7.getAllStringsShorterThan10Characters(), TestGenerators.getAllStringsShorterThan10Characters());
//    }
//
//    @Test
//    public void getIntegerListOfAllStringLengths() {
//        assertEquals(Main7.getIntegerListOfAllStringLengths(), TestGenerators.getIntegerListOfAllStringLengths());
//    }
//
//    @Test
//    public void getTotalCharactersInStringsList() {
//        assertEquals(Main7.getTotalCharactersInStringsList(), TestGenerators.getTotalCharactersInStringsList());
//    }
//
//    @Test
//    public void getAllStringsWhichStartWithA() {
//        assertEquals(Main7.getAllStringsWhichStartWithSmallA(), TestGenerators.getAllStringsWhichStartWithA());
//    }
//
//    @Test
//    public void getAllStringsWhichContainB() {
//        assertEquals(Main7.getAllStringsWhichContainSmallB(), TestGenerators.getAllStringsWhichContainB());
//    }
//
//    @Test
//    public void getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
//        assertEquals(Main7.getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters(), TestGenerators.getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters());
//    }
}

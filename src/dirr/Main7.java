package dirr;

import dirr.no_peeking.Generators;

import java.util.ArrayList;
import java.util.List;

public class Main7 {

    static List<Integer> numbers = Generators.numbers;
    static List<String> strings = Generators.strings;

    public static Integer countNumbers() {
        return numbers.size();
    }

    public static Integer getMaxNumber() {
        Integer maxValue = numbers.get(0);
        for (Integer number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static List<Integer> getAllTwoDigitNumbers() {
        List<Integer> allTwoDigitNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number >= 10 && number <= 99) {
                allTwoDigitNumbers.add(number);
            }
        }
        return allTwoDigitNumbers;
    }

//    public static List<Integer> getAllNumbersPlus100() {
//
//    }
//
//    public static Integer countAllEvenNumbers() {
//
//    }
//
//    public static Boolean[] getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
//
//    }
//
//    public static String getAnyStringOfLength8() {
//
//    }
//
//    public static String getAnyStringOfLength30() {
//
//    }
//
//    public static String[] getAllStringsShorterThan10Characters() {
//
//    }
//
//    public static List<Integer> getIntegerListOfAllStringLengths() {
//
//    }
//
//    public static Integer getTotalCharactersInStringsList() {
//
//    }
//
//    public static List<String> getAllStringsWhichStartWithSmallA() {
//
//    }
//
//    public static List<String> getAllStringsWhichContainSmallB() {
//
//    }
//
//    public static String[] getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
//
//    }
}

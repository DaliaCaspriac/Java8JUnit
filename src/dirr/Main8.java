package dirr;

import dirr.no_peeking.Generators;

import java.util.List;
import java.util.stream.Collectors;


public class Main8 {

    static List<Integer> numbers = Generators.numbers;
    static List<String> strings = Generators.strings;

    public static Integer countNumbers() {
        return (int) numbers.stream().count();
    }

    public static Integer getMaxNumber() {
        return numbers.stream().max(Integer::compareTo).get();
    }

    public static List<Integer> getAllTwoDigitNumbers() {
        return numbers.stream()
                .filter(n -> n >= 10 && n <= 99)
                .collect(Collectors.toList());
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

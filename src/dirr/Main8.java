package dirr;

import dirr.no_peeking.Generators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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

    public static List<Integer> getAllNumbersPlus100() {
        return numbers.stream()
                .map(n -> n + 100)
                .collect(Collectors.toList());
    }

    public static Integer countAllEvenNumbers() {
        return (int) numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
    }

    public static Boolean[] getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
        Function<Integer, Boolean> isMultipleOf7 = x -> x % 7 == 0;
        return numbers.stream()
                .map(isMultipleOf7)
                .collect(Collectors.toList())
                .toArray(new Boolean[]{});
    }

    public static String getAnyStringOfLength8() {
        return strings.stream()
                .filter(s -> s.length() == 8)
                .findAny()
                .orElse(null);
    }

    public static String getAnyStringOfLength30() {
        return strings.stream()
                .filter(s -> s.length() == 30)
                .findAny()
                .orElse(null);
    }

    public static String[] getAllStringsShorterThan10Characters() {
        return strings.stream()
                .filter(s -> s.length()<10)
                .collect(Collectors.toList())
                .toArray(new String[]{});
    }

    public static List<Integer> getIntegerListOfAllStringLengths() {
        return strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static Integer getTotalCharactersInStringsList() {
        return strings.stream()
                .mapToInt(String::length)
                .sum();
    }

    public static List<String> getAllStringsWhichStartWithSmallA() {
        return strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
    }

//    public static List<String> getAllStringsWhichContainSmallB() {
//
//    }
//
//    public static String[] getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
//
//    }
}

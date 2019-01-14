package dirr.no_peeking;

import java.util.ArrayList;
import java.util.List;

public class TestGenerators {

    static List<String> strings = Generators.strings;

    public static Integer countNumbers() {
        return 100;
    }

    public static Integer getMaxNumber() {
        return 99;
    }

    public static List<Integer> getAllTwoDigitNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i < 100; ++i) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> getAllNumbersPlus100() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; ++i) {
            list.add(i + 100);
        }
        return list;
    }

    public static Integer countAllEvenNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i += 2) {
            list.add(i);
        }
        return list.size();
    }

    public static Boolean[] getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < 100; ++i) {
            list.add(i % 7 == 0);
        }
        return list.toArray(new Boolean[0]);
    }

    public static String getAnyStringOfLength8() {
        return strings.get(7);
    }

    public static String getAnyStringOfLength30() {
        return null;
    }

    public static String[] getAllStringsShorterThan10Characters() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 9; ++i) {
            list.add(strings.get(i));
        }
        return list.toArray(new String[0]);
    }

    public static List<Integer> getIntegerListOfAllStringLengths() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; ++i) {
            list.add(i);
        }
        return list;
    }

    public static Integer getTotalCharactersInStringsList() {
        Integer list = 0;
        for (int i = 1; i <= 20; ++i) {
            list += i;
        }
        return list;
    }

    public static List<String> getAllStringsWhichStartWithA() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            if (strings.get(i).charAt(0) == 'a') {
                list.add(strings.get(i));
            }
        }
        return list;
    }

    public static List<String> getAllStringsWhichContainB() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            if (strings.get(i).contains("b")) {
                list.add(strings.get(i));
            }
        }
        return list;
    }

    public static String[] getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i+=2) {
            if (strings.get(i).contains("d") && strings.get(i).contains("c")) {
                list.add(strings.get(i));
            }
        }
        return list.toArray(new String[0]);
    }
}

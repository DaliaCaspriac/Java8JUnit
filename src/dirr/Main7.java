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

    public static List<Integer> getAllNumbersPlus100() {
        List<Integer> numbersPlus100 = new ArrayList<>();
        for (Integer number : numbers) {
            numbersPlus100.add(number + 100);
        }
        return numbersPlus100;
    }

    public static Integer countAllEvenNumbers() {
        int evenNumbersLength = 0;
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbersLength++;
            }
        }
        return evenNumbersLength;
    }

    public static Boolean[] getBooleanArrayOfAllNumbersWhereMultiplesOf7AreTrueRestFalse() {
        List<Boolean> booleanList = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 7 == 0) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return booleanList.toArray(new Boolean[]{});
    }

    public static String getAnyStringOfLength8() {
        for (String str : strings) {
            if (str.length() == 8) {
                return str;
            }
        }
        return null;
    }

    public static String getAnyStringOfLength30() {
        for (String str : strings) {
            if (str.length() == 30) {
                return str;
            }
        }
        return null;
    }

    public static String[] getAllStringsShorterThan10Characters() {
        List<String> shorterThan10Char = new ArrayList<>();
        for (String s : strings) {
            if (s.length() < 10) {
                shorterThan10Char.add(s);
            }
        }
        return shorterThan10Char.toArray(new String[]{});
    }

    public static List<Integer> getIntegerListOfAllStringLengths() {
        List<Integer> stringLengths = new ArrayList<>();
        for(String s : strings){
            stringLengths.add(s.length());
        }
        return stringLengths;
    }

    public static Integer getTotalCharactersInStringsList() {
        Integer totalCharacters = 0;
        for(String s : strings){
            totalCharacters += s.length();
        }
        return totalCharacters;
    }

    public static List<String> getAllStringsWhichStartWithSmallA() {
        List<String> stringsWhichStartWithSmallA = new ArrayList<>();
        for(String s : strings){
            if(s.startsWith("a")){
                stringsWhichStartWithSmallA.add(s);
            }
        }
        return stringsWhichStartWithSmallA;
    }

    public static List<String> getAllStringsWhichContainSmallB() {
        List<String> stringsWhichContainsSmallB = new ArrayList<>();
        for(String s : strings){
            if(s.contains("b")){
                stringsWhichContainsSmallB.add(s);
            }
        }
        return stringsWhichContainsSmallB;
    }

    public static String[] getAllStringsWhichContainBothCAndDAndHaveAnOddNumberOfCharacters() {
        List<String> filtered = new ArrayList<>();
        for(String s : strings){
            if(s.contains("c") && s.contains("d") && s.length() % 2 != 0){
                filtered.add(s);
            }
        }
        return filtered.toArray(new String[]{});
    }
}

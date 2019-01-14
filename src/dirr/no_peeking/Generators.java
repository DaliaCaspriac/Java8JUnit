package dirr.no_peeking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generators {

    public static List<Integer> numbers = initNumbers();
    public static List<String> strings = initStrings();

    static List<Integer> initNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; ++i) {
            list.add(i);
        }
        return list;
    }

    static List<String> initStrings() {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 20; ++i) {
            StringBuilder bob = new StringBuilder();
            for (int j = 0; j < i; ++j) {
                bob.append((char) (random.nextInt(26) + 'a'));
            }
            list.add(bob.toString());
        }
        return list;
    }
}

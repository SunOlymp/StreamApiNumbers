import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {

        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> result = new ArrayList<>();

        for (int x : input) {
            if (x > 0 && x % 2 == 0) result.add(x);
        }
        Collections.sort(result);

        result.forEach(System.out::println);

    }
}
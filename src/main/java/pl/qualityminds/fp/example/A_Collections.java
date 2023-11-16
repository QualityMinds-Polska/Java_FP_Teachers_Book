package pl.qualityminds.fp.example;

import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class A_Collections {

    private static final List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); // modifiable
    private static final List<String> repeat = List.of("1", "3", "1", "2", "1", "2"); // unmodifiable (bcs of of())
    private static final Map<String, Double> map = Map.of("e", 2.71d, "pi", 3.14d, "sqrt", 1.41d); // unmodifiable (bcs of of())

    public static void main(String[] args) {

        Set<String> set = Set.copyOf(repeat); // unmodifiable (bcs of copyOf())

        System.out.println(set);
        Assertions.assertThat(set).containsExactlyInAnyOrder("1", "2", "3"); // the list was 1,3,1,2,1,2
    }
}

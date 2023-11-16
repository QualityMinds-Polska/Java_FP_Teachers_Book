package pl.qualityminds.fp.excercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E_Collect {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "cherry");

        Map<String, Integer> fruitmap = fruits.stream().collect(Collectors.toMap(
                el -> el,          // Key Mapper // Function.identity()
                String::length       // Value Mapper
        ));

        System.out.println(fruitmap);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Integer, Boolean> map = numbers.stream()
                .collect(HashMap::new, (m, el) -> m.put(el, el % 2 == 0), HashMap::putAll);

        System.out.println(map);
    }
}

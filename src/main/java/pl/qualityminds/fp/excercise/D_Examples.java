package pl.qualityminds.fp.excercise;

import java.util.List;

public class D_Examples {

    public static void main(String[] args) {

        List<String> myList = List.of("a", "b", "c", "aa", "bb", "cc");

        myList.stream()
                .filter(el -> el.contains("b"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

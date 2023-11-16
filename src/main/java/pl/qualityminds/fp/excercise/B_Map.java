package pl.qualityminds.fp.excercise;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Map {

    private static final List<String> myList = Arrays.asList("a", "b", "c", "aa", "bb", "cc");

    public static void main(String[] args) {

        List<String> newList1 = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {
            newList1.add(myList.get(i).toUpperCase());
        }

        System.out.println(newList1);

        List<String> newList2 = myList.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(newList2);

        Assertions.assertThat(newList1).isEqualTo(newList2);
    }
}

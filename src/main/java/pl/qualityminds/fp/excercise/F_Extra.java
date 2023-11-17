package pl.qualityminds.fp.excercise;

import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class F_Extra {

    private static final List<String> myList = Arrays.asList("a", "b", "c", "xx", "bb", "cc", "yyy", "bbb", "ccc");

    public static void main(String[] args) {

        List<String> newList1 = IntStream.range(0, myList.size())
                .filter(i -> i % 3 == 0)
                .mapToObj(myList::get)
                .toList();

        System.out.println(newList1);
        Assertions.assertThat(newList1).containsOnly("a", "xx", "yyy");
    }

}

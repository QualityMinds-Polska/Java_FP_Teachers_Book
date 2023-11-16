package pl.qualityminds.fp.excercise;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_Filter {

    private static final List<String> myList = Arrays.asList("a", "b", "c", "aa", "bb", "cc");
    private static final List<String> myList2 = Arrays.asList("a", "b", "c", "aa", "bb", "cc");

    public static void main(String[] args) {

        List<String> newList1 = new ArrayList<>();

        final int size = myList.size(); // not to call size() in every iteration
        for (int i = 0; i < size; i++) {
            if (myList.get(i).contains("b")) {
                newList1.add(myList.get(i));
            }
        }

//        for (String s : myList) {
//            if (s.contains("b")) {
//                newList1.add(s);
//            }
//        }

        System.out.println(newList1);

        List<String> newList2 = myList.stream()
                .filter(el -> el.contains("b"))
                .toList();

        System.out.println(newList2);
        Assertions.assertThat(newList1).isEqualTo(newList2);


        // removeIf // bonus
        myList2.removeIf(el -> !el.contains("b")); // mutates
        System.out.println(myList2);
    }
}

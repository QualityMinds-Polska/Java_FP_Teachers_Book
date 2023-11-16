package pl.qualityminds.fp.excercise;

import org.assertj.core.api.Assertions;

import java.util.List;

public class C_Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum1 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum1 += numbers.get(i);
        }

        System.out.println(sum1);

        int sum2 = numbers.stream()
                .reduce(0, (acc, el) -> acc + el);

        System.out.println(sum2);

        Assertions.assertThat(sum1).isEqualTo(sum2);
    }
}

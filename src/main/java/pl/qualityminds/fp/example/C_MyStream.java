package pl.qualityminds.fp.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C_MyStream {

    private static final String[] array = {"a", "b", "c"};
    private static final Stream<String> streamFromArray = Arrays.stream(array);
    private static final Stream<String> streamFromArray2 = Stream.of(array); // this method is exactly the same as above (it calls Arrays.stream(array))
    private static final Stream<String> stream = Stream.of("a", "b", "c");

    private static final Stream<String> empty = Stream.empty();
    private static final Stream<String> built = Stream.<String>builder().add("a").add("b").add("c").build();
    private static final Stream<String> generated = Stream.generate(() -> "str").limit(10);
    private static final Stream<Integer> iterated = Stream.iterate(0, n -> n + 1).limit(10);

    private static final IntStream intStream = IntStream.range(0, 10);
    private static final IntStream intStreamClosed = IntStream.rangeClosed(0, 10);
    private static final IntStream intStream1 = IntStream.of(1, 2, 3);
    private static final IntStream intStream2 = IntStream.concat(intStream1, intStreamClosed);
    private static final IntStream intStream3 = IntStream.generate(() -> 5).limit(10);
    private static final IntStream intStream4 = IntStream.iterate(0, n -> 2 * n).limit(10);

    public static void main(String[] args) {

        boolean hasA = built.anyMatch("a"::equals);

        System.out.println(hasA);

        int sum = intStream.sum();

        System.out.println(sum);
    }

}

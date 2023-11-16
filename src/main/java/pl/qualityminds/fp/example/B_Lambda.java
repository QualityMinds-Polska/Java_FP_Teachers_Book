package pl.qualityminds.fp.example;

import org.assertj.core.api.Assertions;

public class B_Lambda {

    private static final B_MyLambda B_MY_LAMBDA_1 = new B_MyLambda() {
        @Override
        public int lambda(int a) {
            return a + 5;
        }
    };

    private static final B_MyLambda B_MY_LAMBDA_2 = a -> {
        return a + 5;
    };

    private static final B_MyLambda B_MY_LAMBDA_3 = a -> a + 5;

    public static void main(String[] args) {

        Assertions.assertThat(B_MY_LAMBDA_1.lambda(5)).isEqualTo(B_MY_LAMBDA_3.lambda(5));
    }
}

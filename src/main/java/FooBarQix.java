import java.util.stream.IntStream;

/**
 * Created on 15/10/16.<br/>
 */
public class FooBarQix {
    public static void main(String[] args) {
        NumberTransformer numberTransformer = new NumberTransformer();

        System.out.println(IntStream.range(1, 101).boxed()
                .map(numberTransformer)
                .reduce((number1, number2) -> number1 + '\n' + number2)
                .orElseThrow(IllegalStateException::new));
    }
}

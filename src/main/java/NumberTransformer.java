import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * Created on 15/10/16.<br/>
 *
 * Allow to transform a given integer following these rules:<br/>
 * If integer is divisible by 3 or contains 3 --> replace it by Foo<br/>
 * If integer is divisible by 5 or contains 5 --> replace it by Bar<br/>
 * If integer is divisible by 7 or contains 7 --> replace it by Qix<br/>
 * <br/>
 * Order:<br/>
 * We apply the divisible rule first, then contain rule<br/>
 * Note: We look at the multiple in the following order "Foo", "Bar" and "Qix"
 *
 */
public class NumberTransformer implements Function<Integer, String> {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";

    private static Map<Character, String> stringStringMap = new HashMap<>();

    static {
        stringStringMap.put('3', FOO);
        stringStringMap.put('5', BAR);
        stringStringMap.put('7', QIX);
    }

    @Override
    public String apply(Integer integer) {

        Objects.requireNonNull(integer);

        StringBuilder stringBuilder = new StringBuilder();
        String stringInteger = integer.toString();

        applyMultipleRule(integer, stringBuilder);
        applyNumberRule(stringBuilder, stringInteger);

        return stringBuilder.length() == 0 ? stringInteger : stringBuilder.toString();
    }

    private void applyMultipleRule(Integer integer, StringBuilder stringBuilder) {
        if (integer % 3 == 0) {
            stringBuilder.append(FOO);
        }
        if (integer % 5 == 0) {
            stringBuilder.append(BAR);
        }
        if (integer % 7 == 0) {
            stringBuilder.append(QIX);
        }
    }

    private void applyNumberRule(StringBuilder stringBuilder, String stringInteger) {
        char[] chars = stringInteger.toCharArray();
        for (char aChar : chars) {
            stringBuilder.append(stringStringMap.getOrDefault(aChar, ""));
        }
    }
}

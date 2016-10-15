import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created on 15/10/16.<br/>
 */
public class NumberTransformerTest {

    @DataProvider(name = "integer")
    public static Object[][] integer() {
        return new Object[][]{
                {3, "FooFoo"},
                {33, "FooFooFoo"},
                {51, "FooBar"},
                {53, "BarFoo"},
                {21, "FooQix"},
                {53, "BarFoo"},
                {13, "Foo"},
                {15, "FooBarBar"},
                {11, "11"}
        };
    }

    @Test(dataProvider = "integer")
    public void should_transform_number_into_FooBarQix_combination(Integer integer, String expectedResult) {

        // given
        NumberTransformer underTest = new NumberTransformer();

        // when
        String result = underTest.apply(integer);

        // then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void plus() {
        //given
        final int x = 10;
        final int y = 5;
        final int expected = 15;
        //when
        final int result = calc.plus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void minus() {
        //given
        final int x = 10;
        final int y = 5;
        final int expected = 5;
        //when
        final int result = calc.minus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void devide() {
        //given
        final int x = 10;
        final int y = 5;
        final int expected = 2;
        //when
        final int result = calc.devide.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiply() {
        //given
        final int x = 10;
        final int y = 5;
        final int expected = 50;
        //when
        final int result = calc.multiply.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }
}
package ec.epn.edu.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2, 4, 6});
        objects.add(new Object[]{2, 2, 4});
        objects.add(new Object[]{2, 3, 5});
        objects.add(new Object[]{4, 4, 8});
        objects.add(new Object[]{5, 120, 125});
        objects.add(new Object[]{7, 8, 15});
        objects.add(new Object[]{7, 2, 9});

        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_ok(){
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }
}
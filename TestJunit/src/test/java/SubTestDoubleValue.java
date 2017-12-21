import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubTestDoubleValue {
    private Calculator c;
    private double num1;
    private double num2;
    private double result;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    public SubTestDoubleValue(double num1, double num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 105.2, 1.1, 104.11 }, { 11.5, -11, 22.5 }, { -2.5, 8, -10.5 }, {-3.1, -3.2, 0.1 }
        });
    }

    @Test
    public void testSubDouble() {
        assertEquals(result, c.sub(num1, num2), 3);
    }

    @AfterClass
    public static void reproetResult() {
        System.out.println("End of the test 'SubTestDoubleValue'");
    }
}

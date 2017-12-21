import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SumTest {

    private Calculator c;
    private long num1;
    private long num2;
    private long result;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    public SumTest(long num1, long num2, long result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 2 }, { 1, -11, -10 }, { -2, 8, 6 }, {-3, -3, -6 }, {'5', '3', 'h'}
        });
    }

    @Test
    public void testSum() {
        assertEquals(result, c.sum(num1, num2));
    }

    @AfterClass
    public static void reproetResult() {
        System.out.println("End of the test 'SumTest'");
    }
}

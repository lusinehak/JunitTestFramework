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
public class SubTestLongValue {

    private Calculator c;
    private long num1;
    private long num2;
    private long result;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    public SubTestLongValue(long num1, long num2, long result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 0 }, { 1, -11, 12 }, { -2, 8, -10 }, {-3, -3, 0 }, {'a', 'A', ' '}
        });
    }

    @Test
    public void testSubLong() {
        assertEquals(result, c.sub(num1, num2));
    }

    @AfterClass
    public static void reproetResult() {
        System.out.println("End of the test 'SubTestLongValue'");
    }
}

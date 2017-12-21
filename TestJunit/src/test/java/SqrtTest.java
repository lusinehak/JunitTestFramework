import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void sqrt1() {
        Assert.assertEquals(Math.sqrt(16), c.sqrt(16), 3);
    }

    //Bug c.sqrt returns 2.0 as actual value
    @Test
    public void sqrt2() {
        Assert.assertEquals(Math.sqrt(-4), c.sqrt( -4), 3);
    }

    @Test
    public void sqrt3() {
        Assert.assertEquals(Math.sqrt(0), c.sqrt(0), 3);
    }
}

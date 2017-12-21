import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void pow1() {
        Assert.assertEquals(Math.pow(5.0, 2.0), c.pow(5.0, 2.0), 3);
    }

    @Test
    public void pow2() {
        Assert.assertEquals(Math.pow(4, 0), c.pow( 4, 0), 3);
    }

    @Test
    public void pow3() {
        Assert.assertEquals(Math.pow(0, 0), c.pow(0, 0), 3);
    }

    @Test
    public void pow4() {
        Assert.assertEquals(Math.pow(-4, 3), c.pow(-4, 3), 3);
    }
}

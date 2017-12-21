import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void mult1() {
        Assert.assertEquals(30, c.mult(5, 6));
    }

    @Test
    public void mult2() {
        Assert.assertEquals(-30, c.mult(-5, 6));
    }

    @Test
    public void mult3() {
        Assert.assertEquals(-36, c.mult(-3, 12));
    }

    @Test
    public void mult4() {
        Assert.assertEquals(50, c.mult(-5, -10));
    }

    @Test
    public void mult5() {
        Assert.assertEquals(33.92, c.mult(5.3, 6.4), 3);
    }

    @Test
    public void mult6() {
        Assert.assertEquals(-0.5, c.mult(-5.0, 0.1), 3);
    }

    @Test
    public void mult7() {
        Assert.assertEquals(-3.84, c.mult(-3.2, 1.2), 3);
    }

    @Test
    public void mult8() {
        Assert.assertEquals(16.65, c.mult(-11.1, -1.5), 3);
    }
}

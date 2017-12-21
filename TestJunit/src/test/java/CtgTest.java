import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CtgTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void ctg0() {
        Assert.assertEquals(0.0, c.ctg(Math.toRadians(0.0)), 3);
    }
    @Test
    public void ctg30() {
        Assert.assertEquals(1/Math.tan(Math.toRadians(30.0)), c.ctg(Math.toRadians(30.0)), 3);
    }
    @Test
    public void ctg45() {
        Assert.assertEquals(1/Math.tan(Math.toRadians(45.0)), c.ctg(Math.toRadians(45.0)), 3);
    }
    @Test
    public void ctg60() {
        Assert.assertEquals(1/Math.tan(Math.toRadians(60.0)), c.ctg(Math.toRadians(60.0)), 3);
    }
}

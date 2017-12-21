import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TangentTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    //Returns 0, but tg 0 actually is not defined
    @Test
    public void tg0() {
        Assert.assertEquals(Math.tan(Math.toRadians(0.0)), c.tg(Math.toRadians(0.0)), 3);
    }
    @Test
    public void tg30() {
        Assert.assertEquals(Math.tan(Math.toRadians(30.0)), c.tg(Math.toRadians(30.0)), 3);
    }
    @Test
    public void tg45() {
        Assert.assertEquals(Math.tan(Math.toRadians(45.0)), c.tg(Math.toRadians(45.0)), 3);
    }
    @Test
    public void tg60() {
        Assert.assertEquals(Math.tan(Math.toRadians(60.0)), c.tg(Math.toRadians(60.0)), 3);
    }

}

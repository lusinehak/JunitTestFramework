import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CosTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }
    @Test
    public void cos0() {
        Assert.assertEquals(Math.cos(Math.toRadians(0.0)), c.cos(Math.toRadians(0.0)), 3);
    }
    @Test
    public void cos30() {
        Assert.assertEquals(Math.cos(Math.toRadians(30.0)), c.cos(Math.toRadians(30.0)), 3);
    }
    @Test
    public void cos45() {
        Assert.assertEquals(Math.cos(Math.toRadians(45.0)), c.cos(Math.toRadians(45.0)), 3);
    }
    @Test
    public void cos60() {
        Assert.assertEquals(Math.cos(Math.toRadians(60.0)), c.cos(Math.toRadians(60.0)), 3);
    }

}

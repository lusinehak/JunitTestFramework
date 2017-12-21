import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinTest {

    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }
    @Test
    public void sin0() {
      Assert.assertEquals(Math.sin(Math.toRadians(0.0)), c.sin(Math.toRadians(0.0)), 3);
    }
    @Test
    public void sin30() {
      Assert.assertEquals(Math.sin(Math.toRadians(30.0)), c.sin(Math.toRadians(30.0)), 3);
    }
    @Test
    public void sin45() {
        Assert.assertEquals(Math.sin(Math.toRadians(45.0)), c.sin(Math.toRadians(45.0)), 3);
    }
    @Test
    public void sin60() {
        Assert.assertEquals(Math.sin(Math.toRadians(60.0)), c.sin(Math.toRadians(60.0)), 3);
    }

}

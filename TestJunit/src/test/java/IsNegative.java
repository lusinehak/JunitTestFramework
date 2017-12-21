import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsNegative {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void isNegative1() {
        Assert.assertTrue(c.isNegative(-5));
    }

    @Test
    public void isNegative2() {
        Assert.assertFalse(c.isNegative(30));
    }

    @Test
    public void isNegative3() {
        Assert.assertFalse(c.isNegative(0));
    }
}

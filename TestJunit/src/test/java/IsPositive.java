import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPositive {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void isPositive1() {
        Assert.assertTrue(c.isPositive(5));
    }

    @Test
    public void isPositive2() {
        Assert.assertFalse(c.isPositive(-30));
    }

    @Test
    public void isPositive3() {
        Assert.assertFalse(c.isPositive(0));
    }
}

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivTest {
    private Calculator c;

    @Before
    public void initialize() {
        c = new Calculator();
    }

    @Test
    public void div1() {
        Assert.assertEquals(10, c.div(50, 5));
    }

    @Test
    public void div2() {
        Assert.assertEquals(-5, c.div(-30, 6));
    }

    @Test
    public void div3() {
        Assert.assertEquals(-6, c.div(-12, 2));
    }

    @Test
    public void div4() {
        Assert.assertEquals(5, c.div(-50, -10));
    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void div5() {
        c.div(5, 0);
    }

    @Test
    public void div6() {
        Assert.assertEquals(6.1, c.div(12.2, 3.0), 3);
    }

    @Test
    public void div7() {
        Assert.assertEquals(-50, c.div(-5.0, 0.1), 3);
    }

    @Test
    public void div8() {
        Assert.assertEquals(-4.0, c.div(-3.2, 0.8), 3);
    }

    @Test
    public void div9() {
        Assert.assertEquals(11.1, c.div(-11.1, -1.0), 3);
    }
    @Test(expected = java.lang.NumberFormatException.class)
    public void div10() {
       c.div(5.5, 0);
    }
}

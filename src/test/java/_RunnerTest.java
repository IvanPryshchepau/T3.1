import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivanpryshchepau on 6/22/16.
 */
public class _RunnerTest {

    /*@Test
    public void main() throws Exception {

    }*/

    @Test
    public void checker() throws Exception {
        assertTrue("1212", _Runner.checker("1212"));
    }

    @Test
    public void checkerN() throws Exception {
        assertFalse("1213", _Runner.checker("1213"));
    }

    @Test
    public void checkerN2() throws Exception {
        assertFalse("123435 will write message", _Runner.checker("123435"));
    }

}
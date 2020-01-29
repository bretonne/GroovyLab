import static org.junit.Assert.*;
import org.junit.Test

class AreSameTest {
    int[] a1;
    int[] a2;

    @Test
    public void basicTests() {
        a1 = [121, 144, 19, 161, 19, 144, 19, 11]
        a2 = [11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19]
        assertEquals(true, AreSame.comp(a1, a2))
    }

    @Test
    public void basicTests2() {
        a1 = [121, 144, 19, 161, 19, 144, 19, 11]
        a2 = [11 * 21, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19]
        assertEquals(false, AreSame.comp(a1, a2))
    }

    @Test
    public void basicTests3() {
        a1 = [121, 144, 19, 161, 19, 144, 19, 15, 11]
        a2 = [11 * 21, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19, 15 * 15]
        assertEquals(false, AreSame.comp(a1, a2))
    }

    @Test
    public void basicTests4() {
        a1 = [121, 144, 19, 161, 19, 144, 19, 15, 11]
        a2 = [11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19, 15 * 15, 10 * 10]
        assertEquals(false, AreSame.comp(a1, a2))

        assertEquals(false, AreSame.comp(a1, null))
        assertEquals(false, AreSame.comp(null, a2))
    }

    @Test
    public void basicTests5() {
        a1 = [2, 2, 3];
        a2 = [4, 9, 9];
        assertEquals(false, AreSame.comp(a1, a2));
    }
}

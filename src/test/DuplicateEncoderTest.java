package test;

import static org.junit.Assert.*;

import main.DuplicateEncoder;
import org.junit.Test;

public class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals("(((", DuplicateEncoder.encode("din"));
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
        assertEquals("))((", DuplicateEncoder.encode("(( @"));

        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}

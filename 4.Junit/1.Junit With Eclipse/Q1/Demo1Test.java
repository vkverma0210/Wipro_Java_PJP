import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1Test {
    public static void main(String[] args) {

    }

    Demo1 d1 = new Demo1();

    @Test
    public void testStringConcat() {
        assertEquals("VinayKumar", d1.StringContat("Vinay", "Kumar"));
    }
}

package kiemThu.kiemThuDongDieuKhien.bai3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Bai3Test {
    @Test
    public void test1() {
        assertEquals("A", Bai3.foo(65));
    }

    @Test
    public void test2() {
        assertEquals("B", Bai3.foo(66));
    }

    @Test
    public void test3() {
        assertEquals("C", Bai3.foo(67));
    }

    @Test
    public void test4() {
        assertEquals("haven't check", Bai3.foo(100));
    }
}

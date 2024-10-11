package kiemThu.kiemThuDongDieuKhien.bai2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai2Test {
    @Test
    public void test1() {
        assertEquals(0, Bai2.sum(new int[] {}, 0));
    }
    @Test
    public void test2() {
        assertEquals(12, Bai2.sum(new int[] {12}, 1));
    }
}

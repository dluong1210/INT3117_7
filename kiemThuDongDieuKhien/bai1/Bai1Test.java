package kiemThu.kiemThuDongDieuKhien.bai1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai1Test {
    @Test
    public void test1() {
        assertEquals('I', Bai1.Grade(11));
    }
    @Test
    public void test2() {
        assertEquals('F', Bai1.Grade(4));
    }
    @Test
    public void test3() {
        assertEquals('D', Bai1.Grade(5));
    }
    @Test
    public void test4() {
        assertEquals('C', Bai1.Grade(7));
    }
    @Test
    public void test5() {
        assertEquals('B', Bai1.Grade(8));
    }
    @Test
    public void test6() {
        assertEquals('A', Bai1.Grade(9));
    }
}

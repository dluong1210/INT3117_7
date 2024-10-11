package kiemThu.kiemThuDongDieuKhien.project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TransactionTester {

    @Test
    public void test1() {
        assertEquals(0, Transaction.calculateBill(0, true));
    }

    @Test
    public void test2() {
        assertEquals(1900, Transaction.calculateBill(2000, true));
    }

    @Test
    public void test3() {
        assertEquals(2700000, Transaction.calculateBill(3000000, true));
    }

    @Test
    public void test4() {
        assertEquals(2000, Transaction.calculateBill(2000, false));
    }

    @Test
    public void test5() {
        assertEquals(2850000, Transaction.calculateBill(3000000, false));
    }
}

package kiemThu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TransactionTester {

    // Test case 1: amount = 1000, isVIP = True
    @Test
    public void testCalculateBill_Amount1000_VIP() {
        int amount = 1000;
        boolean isVIP = true;
        int expected = 950;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 2: amount = 10,000,000, isVIP = True
    @Test
    public void testCalculateBill_Amount10M_VIP() {
        int amount = 10000000;
        boolean isVIP = true;
        int expected = 9000000;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 3: amount = 1001, isVIP = True
    @Test
    public void testCalculateBill_Amount1001_VIP() {
        int amount = 1001;
        boolean isVIP = true;
        int expected = 950;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 4: amount = 9,999,999, isVIP = True
    @Test
    public void testCalculateBill_Amount9999999_VIP() {
        int amount = 9999999;
        boolean isVIP = true;
        int expected = 8999999;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 5: amount = 5,000,000, isVIP = True
    @Test
    public void testCalculateBill_Amount5M_VIP() {
        int amount = 5000000;
        boolean isVIP = true;
        int expected = 4500000;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 6: amount = 1000, isVIP = False
    @Test
    public void testCalculateBill_Amount1000_NonVIP() {
        int amount = 1000;
        boolean isVIP = false;
        int expected = 1000;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 7: amount = 10,000,000, isVIP = False
    @Test
    public void testCalculateBill_Amount10M_NonVIP() {
        int amount = 10000000;
        boolean isVIP = false;
        int expected = 9500000;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 8: amount = 1001, isVIP = False
    @Test
    public void testCalculateBill_Amount1001_NonVIP() {
        int amount = 1001;
        boolean isVIP = false;
        int expected = 1001;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 9: amount = 9,999,999, isVIP = False
    @Test
    public void testCalculateBill_Amount9999999_NonVIP() {
        int amount = 9999999;
        boolean isVIP = false;
        int expected = 9499999;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }

    // Test case 10: amount = 5,000,000, isVIP = False
    @Test
    public void testCalculateBill_Amount5M_NonVIP() {
        int amount = 5000000;
        boolean isVIP = false;
        int expected = 4750000;
        assertEquals(expected, Transaction.calculateBill(amount, isVIP));
    }
}

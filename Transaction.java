package kiemThu;

public class Transaction {
    public static int calculateBill(int amount, boolean isVIP) {
        int totalBill = 0;
        try {
            if (amount < 1000 || amount > 10000000) {
                throw new Exception("Số tiền hóa đơn không hợp lệ");
            }

            if (isVIP) {
                if (amount < 2000000) {
                    totalBill = (int) ((double) amount * 0.95);
                } else {
                    totalBill = (int) ((double) amount * 0.9);
                }
            } else {
                if (amount < 2000000) {
                    totalBill = amount;
                } else {
                    totalBill = (int) ((double) amount * 0.95);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return totalBill;
    }

    public static void main(String[] args) {
        System.out.println(calculateBill(1000, false));
    }
}

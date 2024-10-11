package kiemThu.kiemThuDongDieuKhien.bai2;

public class Bai2 {
    public static int sum(int[] a, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += a[i];
        }
        return total;
    }
}

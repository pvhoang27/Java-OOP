import java.util.Scanner;

public class J01022_22 {
    // Mảng lưu độ dài của xâu X[n], tương ứng dãy Fibonacci
    static long[] fib = new long[93];

    public static void main(String[] args) {
        prepareFibonacci(); // Tính trước độ dài các xâu
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số bộ test
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(timKyTu(n, k));
        }
    }

    // Bước 1: Tính trước độ dài dãy Fibonacci đến 92
    public static void prepareFibonacci() {
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
    }

    // Bước 2: Hàm đệ quy tìm ký tự
    public static char timKyTu(int n, long k) {
        // Điều kiện dừng
        if (n == 1) return '0';
        if (n == 2) return '1';
        
        // Nếu K nằm trong phần đầu (tức là nằm trong X[n-2])
        if (k <= fib[n - 2]) {
            return timKyTu(n - 2, k);
        } else {
            // Nếu K nằm trong phần sau (tức là nằm trong X[n-1])
            // Vị trí mới = K - độ dài phần đầu
            return timKyTu(n - 1, k - fib[n - 2]);
        }
    }
}
import java.util.Scanner;

public class J01021_21 {
    
    // Hằng số chia dư theo đề bài
    static final long MOD = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long a = sc.nextLong(); // Dùng nextLong vì số có thể lớn
            long b = sc.nextLong();
            
            // Điều kiện dừng input
            if (a == 0 && b == 0) {
                break;
            }
            
            // In kết quả hàm tự viết (không dùng Math.pow)
            System.out.println(powMod(a, b));
        }
    }

    /**
     * Hàm tính (a^b) % MOD
     * Giải thuật: Lũy thừa nhị phân (Binary Exponentiation)
     * Độ phức tạp: O(log b)
     */
    public static long powMod(long a, long b) {
        long res = 1;
        
        // Vòng lặp chạy khi mũ b > 0
        while (b > 0) {
            // Nếu b lẻ, nhân a vào kết quả
            if (b % 2 == 1) {
                res = (res * a) % MOD;
            }
            
            // Bình phương a lên và chia đôi b
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }
}
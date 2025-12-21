import java.util.Scanner;

public class J02011_32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc dữ liệu đầu vào
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Thuật toán Sắp xếp Chọn
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            // Tìm chỉ số của phần tử nhỏ nhất trong đoạn [i, n-1]
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            
            // Hoán đổi phần tử nhỏ nhất với phần tử ở vị trí i
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
            
            // In kết quả từng bước theo định dạng
            System.out.print("Buoc " + (i + 1) + ":");
            for (int k = 0; k < n; k++) {
                System.out.print(" " + a[k]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
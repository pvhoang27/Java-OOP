import java.util.Scanner;

public class J02010_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số lượng phần tử N
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // Khởi tạo mảng
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Thuật toán Sắp xếp đổi chỗ trực tiếp (Interchange Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Nếu phần tử đứng sau nhỏ hơn phần tử hiện tại thì đổi chỗ
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
            // In kết quả sau mỗi bước
            System.out.print("Buoc " + (i + 1) + ":");
            for (int k = 0; k < n; k++) {
                System.out.print(" " + a[k]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
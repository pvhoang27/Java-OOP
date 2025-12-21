import java.util.Scanner;

public class J02013_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Thuật toán Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // Mỗi vòng lặp sẽ đưa phần tử lớn nhất còn lại về cuối dãy
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán đổi
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu có hoán đổi thì mới in ra bước này và tiếp tục
            if (swapped) {
                System.out.print("Buoc " + (i + 1) + ":");
                for (int k = 0; k < n; k++) {
                    System.out.print(" " + a[k]);
                }
                System.out.println();
            } else {
                // Nếu không có hoán đổi nào, dãy đã sắp xếp xong
                break;
            }
        }
        
        sc.close();
    }
}
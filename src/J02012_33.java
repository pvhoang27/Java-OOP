import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class J02012_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // Tìm vị trí chèn trong danh sách đã sắp xếp
            sortedList.add(key);
            int curr = i;
            while (curr > 0 && sortedList.get(curr - 1) > key) {
                sortedList.set(curr, sortedList.get(curr - 1));
                curr--;
            }
            sortedList.set(curr, key);

            // In kết quả theo định dạng: Buoc i: dãy_đã_sắp_xếp
            System.out.print("Buoc " + i + ":");
            for (int x : sortedList) {
                System.out.print(" " + x);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
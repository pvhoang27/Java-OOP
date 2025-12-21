
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J02006_28 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // TreeSet tự động loại bỏ số trùng và sắp xếp tăng dần
        TreeSet<Integer> set = new TreeSet<>();
        
        // Đọc dãy a[] và thêm vào set
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        
        // Đọc dãy b[] và thêm vào set
        // (Nếu số đã có rồi thì set tự bỏ qua, nếu chưa có thì thêm vào)
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        
        // In kết quả
        for (Integer x : set) {
            System.out.print(x + " ");
        }
    }
}

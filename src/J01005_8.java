/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
import java.util.*;
public class J01005_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            double H = sc.nextDouble();

            for (int i = 1; i < N; i++) {
                double h = H * Math.sqrt((double) i / N);
                System.out.printf("%.6f ", h);
            }
            System.out.println();
        }
    }
}

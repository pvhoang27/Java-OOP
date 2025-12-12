/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
import java.util.*;

public class J01001_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a <= 0 || b <= 0) {
            System.out.println(0);
            return;
        }
        long chuvi = 2*(a+ b);
        long  dientich = a * b;
        System.out.println(chuvi +" " +dientich);
    }
}

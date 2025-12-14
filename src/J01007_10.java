/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
import java.util.*;

public class J01007_10 {
    public static boolean isFibo(long n) {
    if (n < 0) return false;
    if (n == 0 || n == 1) return true;

    long a = 0, b = 1;
    while (b < n) {
        long c = a + b;
        a = b;
        b = c;
    }
    return b == n;
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t --> 0){
           long a = sc.nextLong();
           if(isFibo(a)) System.out.println("YES");
           else System.out.println("NO");
       }
    }
}

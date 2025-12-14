
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J01006_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fib = new long[93];
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        while(t --> 0 ){
            int a = sc.nextInt();
            System.out.println(fib[a]);
            
        }
    }
}

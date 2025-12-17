
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */

public class J01011_14 {
    public static long ucln(long a , long b){
        if ( b == 0) return a ;
        return ucln(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t --> 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long uc = ucln(a, b);
            long bc = a * b  /uc;
            System.out.println(bc + " " + uc );
        }
    }
}

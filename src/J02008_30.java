
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J02008_30 {
    public static long ucln(long a , long b ){
        while(b != 0){
            long temp = a % b ;
            a = b;
            b = temp;
        }
        return a ; 
    }
    public static long bcnn(long a , long b){
        if (a == 0 || b == 0 ) return 0;
        return (a * b / ucln(a, b));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long a = sc.nextInt();
            long kq = 1; 
            for(int i = 1 ; i <= a ; i++){
                 kq = bcnn(kq, i);
            }
            System.out.println(kq);
        }
        
    }
}

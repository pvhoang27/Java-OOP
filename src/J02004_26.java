
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J02004_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0 ){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            boolean ok = true;
            for(int i = 0 ; i < n; i++){
                if(a[i] != a[n - 1 - i] ){
                    ok = false ;
                    break; 
                }
            }
            System.out.println(ok ? "YES" : "NO ");
        }
    }
}

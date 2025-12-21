
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J02014_35 {
    public static int check(int [] a , int n, long tong ){
        long tongtrai = 0;
        for(int i = 0 ; i < n; i++){
            long tongphai = tong - tongtrai - a[i];
            if(tongphai == tongtrai) return i + 1;
            tongtrai += a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            long tong = 0 ; 
            for(int i = 0 ; i < n; i++){
                a[i] = sc.nextInt();
                tong += a[i];
            }
            System.out.println(check(a, n, tong));
        }
    }
}


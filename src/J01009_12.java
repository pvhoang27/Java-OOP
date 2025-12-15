/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
import java.util.*;
public class J01009_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = 0 ; 
        long  gt = 1 ;
        for(int i = 1 ; i <= a; i++){
            gt *= i ;
            sum += gt;
        }
        System.out.println(sum);
    }
}

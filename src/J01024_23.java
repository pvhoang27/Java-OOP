
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J01024_23 {
    public static boolean check(String s){
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            int a  = c - '0';
            if ( a != 0 && a != 1 && a != 2  ) return false;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String b = sc.next();
            if(check(b)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}

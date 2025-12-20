
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J01016_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String b = "" + a;
        int sum = 0 ; 
        for(int i = 0 ; i < b.length(); i++){
            char c = b.charAt(i);
            if(c == '4' || c == '7') sum ++;
        }
        if (sum == 4 || sum == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}

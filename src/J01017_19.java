
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J01017_19 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long a = sc.nextLong();
            String b = "" + a;
            boolean ok =  true;
            int sum = 0 ;
            for(int i = 0 ; i < b.length(); i++){
                char c = b.charAt(i);
                sum += (c -'0');
            }
            if(sum % 10 != 0) ok = false ; 
            for(int i = 0 ; i < b.length() - 1  ; i++){
                int c = b.charAt(i) - '0';
                
                int d = b.charAt(i+ 1) - '0';
                if (Math.abs(c - d) != 2 ) {
                    ok = false; 
                    break;         
                }
            }
            if (ok == true ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

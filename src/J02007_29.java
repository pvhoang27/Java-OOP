
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class J02007_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int dem  = 0 ;
        while(t --> 0){
            dem ++;
            
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] cnt = new int[1000005];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
                cnt[a[i]] ++;
            }
            System.out.println("Test "+dem + ":" );
            for(int i = 0 ; i < n; i++){
                if(cnt[a[i]] > 0 ){
                    System.out.println(a[i] + " xuat hien "+ cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
        }
    }
}

import java.util.Scanner;

public class J01012_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int cnt = 0;
            
            // Chỉ chạy vòng lặp đến căn bậc 2 của a
            for(int i = 1; i * i <= a; i++){
                if(a % i == 0){
                    // Kiểm tra ước thứ nhất (i)
                    if(i % 2 == 0) cnt++;
                    
                    // Kiểm tra ước thứ hai (a/i)
                    // Điều kiện (i * i != a) để tránh đếm 2 lần nếu a là số chính phương
                    if(i * i != a) {
                        if((a / i) % 2 == 0) cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
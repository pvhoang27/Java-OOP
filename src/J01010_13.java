import java.util.Scanner;

public class J01010_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            // Sửa 1: Đọc thẳng String, không dùng nextLong() để an toàn hơn với số 18 chữ số
            String s = sc.next(); 
            String kq = "";
            boolean ok = true;
            
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                // Logic ghép chuỗi
                if(c == '0' || c == '1' || c == '8' || c == '9'){
                    if(c == '1') kq += "1";
                    else kq += "0"; // 0, 8, 9 đều thành 0
                } else {
                    ok = false;
                    break;
                }
            }
            
            if(!ok){
                System.out.println("INVALID");
            } else {
                long kqe = Long.parseLong(kq);
                // Sửa 2: Kiểm tra nếu kết quả bằng 0 thì cũng là INVALID
                if(kqe == 0) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(kqe);
                }
            }
        }
    }
}
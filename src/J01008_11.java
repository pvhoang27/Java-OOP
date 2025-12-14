import java.util.Scanner;

public class J01008_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 1; test <= t; test++) {
            long n = sc.nextLong();
            System.out.print("Test " + test + ": ");

            long temp = n;

            for (int i = 2; i * i <= temp; i++) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                if (cnt > 0) {
                    System.out.print(i + "(" + cnt + ") ");
                }
            }

            if (temp > 1) {
                System.out.print(temp + "(1)");
            }

            System.out.println();
        }
    }
}

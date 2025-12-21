import java.util.*;

public class J02005_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }

        TreeSet<Integer> res = new TreeSet<>();
        for (int x : A) {
            if (B.contains(x)) {
                res.add(x);
            }
        }

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

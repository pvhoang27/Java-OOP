import java.util.*;

public class J01025_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1a = sc.nextInt(), y1a = sc.nextInt(), x2a = sc.nextInt(), y2a = sc.nextInt();
        int x1b = sc.nextInt(), y1b = sc.nextInt(), x2b = sc.nextInt(), y2b = sc.nextInt();

        int minX = Math.min(x1a, x1b);
        int minY = Math.min(y1a, y1b);
        int maxX = Math.max(x2a, x2b);
        int maxY = Math.max(y2a, y2b);

        long w = (long) maxX - minX;
        long h = (long) maxY - minY;

        long s = Math.max(w, h);
        System.out.println(s * s);
    }
}

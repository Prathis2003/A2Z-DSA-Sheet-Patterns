import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(sb.toString().substring(i, n));
        }
    }
}

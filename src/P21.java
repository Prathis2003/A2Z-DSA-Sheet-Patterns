import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        String space = "";
        for (int i = 0; i < n; i++) {
            star += "*";
            if (i < n - 2) {
                space += " ";
            }
        }
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n) {
                System.out.println(star);
            } else {
                System.out.println("*" + space + "*");
            }
        }
    }
}

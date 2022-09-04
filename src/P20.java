import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = "";
        String star = "";
        String starRev = "";
        for (int i = 0; i < n - 2; i++) {
            space += " ";
        }
        for (int i = 0; i < n / 2; i++) {
            star += "*";
            starRev = "*" + starRev;
            System.out.println(star + space.substring(0, space.length() - 2 * i) + starRev);
        }
        space = "";
        for (int i = 0; i <= n / 2 - 2; i++) {
            space += "  ";
            System.out.println(star.substring(0, star.length() - i - 1) + space + starRev.substring(i + 1));
        }
    }
}

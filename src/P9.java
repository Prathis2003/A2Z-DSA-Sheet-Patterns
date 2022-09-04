import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        String space = "";
        for (int i = 0; i < n; i++) {
            space += " ";
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(space.substring(i, n) + star);
            System.out.println();
            if (star.length() == 2 * n - 1)
                break;
            star += "**";
        }
        space = " ";
        for (int i = 0; i < n && i + 1 < star.length() - i - 1; i++) {
            System.out.print(space + star.substring(i + 1, star.length() - i - 1));
            space += " ";
            System.out.println();
        }
    }
}

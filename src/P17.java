import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = "";
        for (int i = 0; i < n; i++) {
            space += " ";
        }
        String str = "";
        String rev = "";
        for (int i = 0; i < n; i++) {
            str += Character.toString(65 + i);
            rev = Character.toString(65 + i) + rev;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(space.substring(i + 1, n) + str.substring(0, i + 1) + rev.substring(n - i, n));
        }
    }
}

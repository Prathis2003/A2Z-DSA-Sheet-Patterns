import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        String space = "";
        for (int i = 1; i <= 2 * n - 1; i++) {
            str += "*";
        }
        for (int i = 0; i < n; i++) {
            System.out.print(space + str.substring(i, str.length() - i));
            space += " ";
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = "";
        String str2 = "";
        String space = "";
        for (int i = 1; i <= 2 * n - 2; i++) {
            space += " ";
        }
        for (int i = 0; i < n && i <= space.length() - i; i++) {
            str1 += (i + 1);
            str2 = (i + 1) + str2;
            System.out.println(str1 + space.substring(i, space.length() - i) + str2);
        }
    }
}

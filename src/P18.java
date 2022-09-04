import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

        for (int i = 0; i < n; i++) {
            str = Character.toString(65 + n - i - 1) + " " + str;
            System.out.println(str);
        }
    }
}

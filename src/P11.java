import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "1";
        for (int i = 0; i < n; i++) {
            System.out.println(str);
            if (i % 2 == 0) {
                str = "0 " + str;
            } else {
                str = "1 " + str;
            }
        }
    }
}

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (char i = 'A'; i < 'A' + n; i++) {
            str += i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str.substring(0, n - i));
        }
    }

}

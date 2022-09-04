import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (char ch = 'A'; ch < 'A' + n; ch++) {
            str += ch;
            System.out.println(str);
        }
    }
}

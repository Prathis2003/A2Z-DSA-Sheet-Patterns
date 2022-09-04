import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "*";
        String space = "";
        for (int i = 1; i <= n; i++) {
            space += " ";
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(space.substring(i, n) + str);
            str += "**";
            System.out.println();
        }
    }
}

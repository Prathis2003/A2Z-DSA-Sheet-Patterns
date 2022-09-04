import java.util.Scanner;
public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "A";
        char currChar = 'A';
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
            str = str.replaceAll(String.valueOf(currChar), String.valueOf(++currChar));
            str += currChar;
        }

    }
}

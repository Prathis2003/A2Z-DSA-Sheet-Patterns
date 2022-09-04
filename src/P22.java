import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n;
        n = 2 * n - 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int minimum = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(N - minimum);
            }
            System.out.println();
        }
    }
}

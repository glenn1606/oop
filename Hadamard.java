import java.util.Scanner;

public class Hadamard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        if ((n & (n - 1)) != 0) {
            System.out.println("Error: n must be a power of 2.");
            return;
        }

        boolean[][] H = hadamard(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(H[i][j] ? "T " : "F ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static boolean[][] hadamard(int n) {
        if (n == 1) {
            return new boolean[][] { { true } };
        }

        int half = n / 2;
        boolean[][] Hn = hadamard(half);
        boolean[][] H = new boolean[n][n];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                H[i][j] = Hn[i][j];
                H[i][j + half] = Hn[i][j];
                H[i + half][j] = Hn[i][j];
                H[i + half][j + half] = !Hn[i][j];
            }
        }
        return H;
    }
}

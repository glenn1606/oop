import java.util.Random;
import java.util.Scanner;

class RandomWalkers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean[][] seen = new boolean[n][n];
        int[] x = new int[n];
        int[] y = new int[n];
        int visitedCount = 0;
        int cells = n*n;

        for(int i = 0; i < n; i++){
            x[i] = n/2;
            y[i] = n/2;
        }
        visitedCount++;
        seen[n/2][n/2] = true;
        Random random = new Random();
        int steps = 0;
        while(steps < cells){
            steps++;

            for(int i = 0; i < 4; i++){
                int t = random.nextInt(4);
                switch (t){
                    case 0: if(x[i]>0) x[i]--; break;
                    case 1: if(x[i]<n-1) x[i]++; break;
                    case 2: if(y[i]>0) y[i]--; break;
                    case 3: if(y[i]<n-1) y[i]++; break;
                }
                if(!seen[x[i]][y[i]]){
                    seen[x[i]][y[i]] = true;
                    visitedCount++;
                }
            }
        }
        System.out.println("All cells visited after " + steps + " steps.");
        scanner.close();
    }

}

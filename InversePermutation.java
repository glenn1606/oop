import java.util.Scanner;

public class InversePermutation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //check valid permutation
        boolean[] seen = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(a[i] < 0 || a[i] >= n) {
                System.out.println("The permutation is not valid.");
                return;
            }
            if (seen[a[i]]){
                System.out.println("a[i] has been duplicated");
                return;
            }
            seen[a[i]] = true;
        }
        // permutation cal
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[a[i]] = i;
        }
        System.out.println("Inverse permutation : ");
        for(int i = 0; i < n; i++){
            System.out.println(b[i] + " ");
        }
        scanner.close();
    }

}
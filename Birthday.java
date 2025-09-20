import java.util.Random;

public class Birthday {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean[] seen = new boolean[365]; // 365 possible birthdays
        int count = 0;

        while (true) {
            int birthday = rand.nextInt(365); // random day 0–364
            count++;

            if (seen[birthday]) {
                System.out.println("Match found after " + count + " people.");
                break;
            }

            seen[birthday] = true;
        }
    }
}

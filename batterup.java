import java.util.Scanner;

/**
 *
 * @author drean
 */
public class Batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        double validCounts = 0;
        double total = 0;
        while (cases-- > 0) {
            int score = sc.nextInt();
            if (score != -1) {
                validCounts++;
                total += score;
            }
        }
        System.out.println(total / validCounts);
        sc.close();
    }
}

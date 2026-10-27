import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            System.printf("%d ", i);
        }

        for (int i = a; i >= 1; i--) {
            System.printf("%d ", i);
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Integer M = Integer.parseInt(input.split(" ")[0]);
        Integer N = Integer.parseInt(input.split(" ")[1]);

        double sqrt = Math.sqrt(N);
        boolean decimal = false;
        for (int i = M; i < N + 1; i++) {
            for (int j = 2; j < sqrt + 1; j++) {
                if (i / j == 1) {
                    decimal = true;
                    break;
                }
                if (i % j != 0) {
                    decimal = true;
                }
                if (i % j == 0 || i == 1) {
                    decimal = false;
                    break;
                }
            }
            if (decimal) {
                System.out.println(i);
            }
            decimal = false;
        }
    }
}

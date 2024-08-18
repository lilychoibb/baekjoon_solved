import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int co = sc.nextInt();
        int ci = sc.nextInt();

        int[] burger = {b1, b2, b3};
        int[] drink = {co, ci};

        int cheap = Integer.MAX_VALUE;
        for (int bu : burger) {
            for (int dr : drink) {
                if (bu + dr - 50 < cheap) {
                    cheap = bu + dr - 50;
                }
            }
        }
        System.out.println(cheap);
    }
}

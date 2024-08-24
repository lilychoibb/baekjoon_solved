import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int D = 0;
        int P = 0;
        sc.nextLine();
        String[] expect = new String[i];
        for (int j = 0; j < i; j++) {
            expect[j] = sc.nextLine();
        }

        for (String s : expect) {
            if (s.equals("D")) {
                D += 1;
            } else if (s.equals("P")) {
                P += 1;
            }
            if (Math.abs(D - P) == 2) {
                break;
            }
        }

        System.out.println(D + ":" + P);
    }
}

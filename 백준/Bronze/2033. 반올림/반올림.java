import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        double position = 0.1;
        int now = 10;
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s) >= now) {
                s = String.valueOf(Math.round(Integer.parseInt(s) * position) * now);
                position *= 0.1;
                now *= 10;
            }
        }

        System.out.println(s);
    }
}

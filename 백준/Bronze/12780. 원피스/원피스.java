import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String H = sc.nextLine();
        String N = sc.nextLine();
        int length = N.length();

        int count = 0;
        for (int i = 0; i <= H.length() - length; i++) {
            if (H.substring(i, i + length).equals(N)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}

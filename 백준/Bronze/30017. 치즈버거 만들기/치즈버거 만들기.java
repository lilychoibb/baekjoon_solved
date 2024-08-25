import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p = Integer.parseInt(s.split(" ")[0]);
        int c = Integer.parseInt(s.split(" ")[1]);

        if (p - c > 1) {
            System.out.println(c + 1 + c);
        } else {
            System.out.println(p + p - 1);
        }
    }
}

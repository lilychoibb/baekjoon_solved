import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < i; j++) {
            String[] split = sc.nextLine().split(" ");
            for (String s : split) {
                System.out.print(new StringBuilder(s).reverse() + " ");
            }
        }
    }
}

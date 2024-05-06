import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] change = {25, 10, 5, 1};
        for (int i = 0; i < input; i++) {
            int money = sc.nextInt();
            List<String> ss = new ArrayList<>();
            for (int change1 : change) {
                ss.add(String.valueOf(money / change1));
                money -= change1 * (money / change1);
            }
            System.out.println(String.join(" ", ss));
        }
    }
}
